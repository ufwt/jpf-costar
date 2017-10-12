package costar;

import costar.config.CoStarConfig;
import gov.nasa.jpf.Config;
import gov.nasa.jpf.JPF;
import gov.nasa.jpf.JPFShell;
import gov.nasa.jpf.util.JPFLogger;
import gov.nasa.jpf.util.LogManager;

public class CoStar implements JPFShell {

	private Config config;

	private CoStarConfig cc;

	private JPFLogger logger;

	public static final String CONFIG_KEY_COSTAR_EXPLORER = "costar.costar_explorer_instance";

	public CoStar(Config config) {
		LogManager.init(config);
		this.config = config;
		this.cc = new CoStarConfig(config);
		this.logger = JPF.getLogger("costar");
	}

	public void start(String[] strings) {
		run();
	}

	public void run() {
		logger.info("CoStar.run() -- begin");

		logger.info(config);
		logger.info(cc);

		// prepare config
		Config jpfConf = cc.generateJPFConfig(config);

		// Configure JPF
		jpfConf.remove("shell");
		jpfConf.setProperty("jvm.insn_factory.class", CoStarInstructionFactory.class.getName());

		String listener = CoStarListener.class.getName();
		if (jpfConf.hasValue("listener"))
			listener += ";" + jpfConf.getString("listener");
		jpfConf.setProperty("listener", listener);
		jpfConf.setProperty("perturb.class", CoStarPerturbator.class.getName());
		jpfConf.setProperty(CONFIG_KEY_COSTAR_EXPLORER, CoStarExplorer.class.getName());

		logger.info(jpfConf);

		// run jpf ...
		JPF jpf = new JPF(jpfConf);
		jpf.run();

		logger.info("CoStar.run() -- end");
	}

	public static CoStarExplorer getCoStarExplorer(Config config) {
		CoStarExplorer explorer = config.getEssentialInstance(CONFIG_KEY_COSTAR_EXPLORER, CoStarExplorer.class);
		if (!explorer.isConfigured()) {
			explorer.configure(new CoStarConfig(config));
		}
		
		return explorer;
	}

}
