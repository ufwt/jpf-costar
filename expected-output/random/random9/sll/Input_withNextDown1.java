package random.sll;

import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class Input_withNextDown1 extends TestJPF {

	@Test
	public void test_withNextDown1() throws Exception {
		Input obj = new Input();
		random.sll.Node root = new random.sll.Node();
		random.sll.Node next_2 = null;
		int elem_1 = 5;
		root.elem = elem_1;
		root.next = next_2;
		obj.withNextDown(root);
	}

	@Test
	public void test_withNextDown2() throws Exception {
		Input obj = new Input();
		random.sll.Node root = new random.sll.Node();
		random.sll.Node next_2 = new random.sll.Node();
		random.sll.Node next_4 = new random.sll.Node();
		random.sll.Node next_6 = new random.sll.Node();
		random.sll.Node next_8 = new random.sll.Node();
		random.sll.Node next_10 = new random.sll.Node();
		random.sll.Node next_12 = null;
		int elem_9 = 16;
		int elem_11 = -4;
		int elem_3 = -7;
		int elem_1 = -9;
		int elem_7 = -28;
		int elem_5 = 10;
		root.elem = elem_1;
		root.next = next_2;
		next_2.elem = elem_3;
		next_2.next = next_4;
		next_4.elem = elem_5;
		next_4.next = next_6;
		next_6.elem = elem_7;
		next_6.next = next_8;
		next_8.elem = elem_9;
		next_8.next = next_10;
		next_10.elem = elem_11;
		next_10.next = next_12;
		obj.withNextDown(root);
	}

	@Test
	public void test_withNextDown3() throws Exception {
		Input obj = new Input();
		random.sll.Node root = new random.sll.Node();
		random.sll.Node next_2 = new random.sll.Node();
		random.sll.Node next_4 = new random.sll.Node();
		random.sll.Node next_6 = new random.sll.Node();
		random.sll.Node next_8 = new random.sll.Node();
		random.sll.Node next_10 = new random.sll.Node();
		random.sll.Node next_12 = new random.sll.Node();
		random.sll.Node next_14 = null;
		int elem_13 = -23;
		int elem_9 = 24;
		int elem_11 = 27;
		int elem_3 = -32;
		int elem_1 = 27;
		int elem_7 = -32;
		int elem_5 = -17;
		root.elem = elem_1;
		root.next = next_2;
		next_2.elem = elem_3;
		next_2.next = next_4;
		next_4.elem = elem_5;
		next_4.next = next_6;
		next_6.elem = elem_7;
		next_6.next = next_8;
		next_8.elem = elem_9;
		next_8.next = next_10;
		next_10.elem = elem_11;
		next_10.next = next_12;
		next_12.elem = elem_13;
		next_12.next = next_14;
		obj.withNextDown(root);
	}

	@Test
	public void test_withNextDown4() throws Exception {
		Input obj = new Input();
		random.sll.Node root = new random.sll.Node();
		random.sll.Node next_2 = new random.sll.Node();
		random.sll.Node next_4 = null;
		int elem_3 = -21;
		int elem_1 = 31;
		root.elem = elem_1;
		root.next = next_2;
		next_2.elem = elem_3;
		next_2.next = next_4;
		obj.withNextDown(root);
	}

	@Test
	public void test_withNextDown5() throws Exception {
		Input obj = new Input();
		random.sll.Node root = new random.sll.Node();
		random.sll.Node next_2 = new random.sll.Node();
		random.sll.Node next_4 = new random.sll.Node();
		random.sll.Node next_6 = new random.sll.Node();
		random.sll.Node next_8 = null;
		int elem_3 = -32;
		int elem_1 = -4;
		int elem_7 = -14;
		int elem_5 = -30;
		root.elem = elem_1;
		root.next = next_2;
		next_2.elem = elem_3;
		next_2.next = next_4;
		next_4.elem = elem_5;
		next_4.next = next_6;
		next_6.elem = elem_7;
		next_6.next = next_8;
		obj.withNextDown(root);
	}

	@Test
	public void test_withNextDown6() throws Exception {
		Input obj = new Input();
		random.sll.Node root = new random.sll.Node();
		random.sll.Node next_2 = new random.sll.Node();
		random.sll.Node next_4 = new random.sll.Node();
		random.sll.Node next_6 = null;
		int elem_3 = 10;
		int elem_1 = -2;
		int elem_5 = 19;
		root.elem = elem_1;
		root.next = next_2;
		next_2.elem = elem_3;
		next_2.next = next_4;
		next_4.elem = elem_5;
		next_4.next = next_6;
		obj.withNextDown(root);
	}

	@Test
	public void test_withNextDown7() throws Exception {
		Input obj = new Input();
		random.sll.Node root = new random.sll.Node();
		random.sll.Node next_2 = new random.sll.Node();
		random.sll.Node next_4 = new random.sll.Node();
		random.sll.Node next_6 = new random.sll.Node();
		random.sll.Node next_8 = new random.sll.Node();
		random.sll.Node next_10 = new random.sll.Node();
		random.sll.Node next_12 = new random.sll.Node();
		random.sll.Node next_14 = new random.sll.Node();
		random.sll.Node next_16 = null;
		int elem_13 = -18;
		int elem_9 = -25;
		int elem_11 = 1;
		int elem_15 = -13;
		int elem_3 = -20;
		int elem_1 = -13;
		int elem_7 = 17;
		int elem_5 = 10;
		root.elem = elem_1;
		root.next = next_2;
		next_2.elem = elem_3;
		next_2.next = next_4;
		next_4.elem = elem_5;
		next_4.next = next_6;
		next_6.elem = elem_7;
		next_6.next = next_8;
		next_8.elem = elem_9;
		next_8.next = next_10;
		next_10.elem = elem_11;
		next_10.next = next_12;
		next_12.elem = elem_13;
		next_12.next = next_14;
		next_14.elem = elem_15;
		next_14.next = next_16;
		obj.withNextDown(root);
	}

	@Test
	public void test_withNextDown8() throws Exception {
		Input obj = new Input();
		random.sll.Node root = new random.sll.Node();
		random.sll.Node next_2 = new random.sll.Node();
		random.sll.Node next_4 = new random.sll.Node();
		random.sll.Node next_6 = new random.sll.Node();
		random.sll.Node next_8 = new random.sll.Node();
		random.sll.Node next_10 = new random.sll.Node();
		random.sll.Node next_12 = new random.sll.Node();
		random.sll.Node next_14 = new random.sll.Node();
		random.sll.Node next_16 = new random.sll.Node();
		random.sll.Node next_18 = null;
		int elem_13 = 14;
		int elem_9 = -10;
		int elem_11 = 18;
		int elem_17 = 29;
		int elem_15 = 18;
		int elem_3 = -9;
		int elem_1 = 9;
		int elem_7 = 26;
		int elem_5 = 0;
		root.elem = elem_1;
		root.next = next_2;
		next_2.elem = elem_3;
		next_2.next = next_4;
		next_4.elem = elem_5;
		next_4.next = next_6;
		next_6.elem = elem_7;
		next_6.next = next_8;
		next_8.elem = elem_9;
		next_8.next = next_10;
		next_10.elem = elem_11;
		next_10.next = next_12;
		next_12.elem = elem_13;
		next_12.next = next_14;
		next_14.elem = elem_15;
		next_14.next = next_16;
		next_16.elem = elem_17;
		next_16.next = next_18;
		obj.withNextDown(root);
	}

	@Test
	public void test_withNextDown9() throws Exception {
		Input obj = new Input();
		random.sll.Node root = null;
		obj.withNextDown(root);
	}

	@Test
	public void test_withNextDown10() throws Exception {
		Input obj = new Input();
		random.sll.Node root = new random.sll.Node();
		random.sll.Node next_2 = new random.sll.Node();
		random.sll.Node next_4 = new random.sll.Node();
		random.sll.Node next_6 = new random.sll.Node();
		random.sll.Node next_8 = new random.sll.Node();
		random.sll.Node next_10 = null;
		int elem_9 = -30;
		int elem_3 = 13;
		int elem_1 = -11;
		int elem_7 = -23;
		int elem_5 = -13;
		root.elem = elem_1;
		root.next = next_2;
		next_2.elem = elem_3;
		next_2.next = next_4;
		next_4.elem = elem_5;
		next_4.next = next_6;
		next_6.elem = elem_7;
		next_6.next = next_8;
		next_8.elem = elem_9;
		next_8.next = next_10;
		obj.withNextDown(root);
	}

}

