package plexilNEqNull;

import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;
import plexil.PlexilTreeParser;

public class PlexilTreeParser_integerValue1 extends TestJPF {

	@Test
	public void test_integerValue1() throws Exception {
		PlexilTreeParser obj = new PlexilTreeParser();
		plexil.PlexilASTNode _t = new plexil.PlexilASTNode();
		obj.ASTNULL = new antlr.ASTNULLType();
		int ttype_1 = 0;
		plexil.PlexilASTNode right_3 = null;
		plexil.PlexilASTNode down_2 = null;
		_t.ttype = ttype_1;
		_t.down = down_2;
		_t.right = right_3;
		obj.integerValue(_t);
	}

	@Test
	public void test_integerValue2() throws Exception {
		PlexilTreeParser obj = new PlexilTreeParser();
		plexil.PlexilASTNode _t = new plexil.PlexilASTNode();
		obj.ASTNULL = new antlr.ASTNULLType();
		plexil.PlexilASTNode _t_1 = _t;
		plexil.PlexilASTNode integerValue_AST_in_2 = _t_1;
		plexil.PlexilASTNode tmp57_AST_in_3 = _t_1;
		plexil.PlexilASTNode paramAST_4 = _t_1;
		int paramInt_5 = 108;
		int ttype_9 = 108;
		plexil.PlexilASTNode right_11 = null;
		plexil.PlexilASTNode down_10 = null;
		_t.ttype = ttype_9;
		_t.down = down_10;
		_t.right = right_11;
		obj.integerValue(_t);
	}

}

