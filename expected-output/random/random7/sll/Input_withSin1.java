package random.sll;

import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class Input_withSin1 extends TestJPF {

	@Test
	public void test_withSin1() throws Exception {
		Input obj = new Input();
		random.sll.Node root = new random.sll.Node();
		random.sll.Node next_2 = null;
		int elem_1 = -7;
		root.elem = elem_1;
		root.next = next_2;
		obj.withSin(root);
	}

	@Test
	public void test_withSin2() throws Exception {
		Input obj = new Input();
		random.sll.Node root = new random.sll.Node();
		random.sll.Node next_2 = new random.sll.Node();
		random.sll.Node next_4 = new random.sll.Node();
		random.sll.Node next_6 = new random.sll.Node();
		random.sll.Node next_8 = new random.sll.Node();
		random.sll.Node next_10 = new random.sll.Node();
		random.sll.Node next_12 = null;
		int elem_9 = 9;
		int elem_11 = 7;
		int elem_3 = 19;
		int elem_1 = 29;
		int elem_7 = -28;
		int elem_5 = 9;
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
		obj.withSin(root);
	}

	@Test
	public void test_withSin3() throws Exception {
		Input obj = new Input();
		random.sll.Node root = new random.sll.Node();
		random.sll.Node next_2 = new random.sll.Node();
		random.sll.Node next_4 = new random.sll.Node();
		random.sll.Node next_6 = new random.sll.Node();
		random.sll.Node next_8 = new random.sll.Node();
		random.sll.Node next_10 = new random.sll.Node();
		random.sll.Node next_12 = new random.sll.Node();
		random.sll.Node next_14 = null;
		int elem_13 = -6;
		int elem_9 = 20;
		int elem_11 = 30;
		int elem_3 = -18;
		int elem_1 = 20;
		int elem_7 = 5;
		int elem_5 = 11;
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
		obj.withSin(root);
	}

	@Test
	public void test_withSin4() throws Exception {
		Input obj = new Input();
		random.sll.Node root = new random.sll.Node();
		random.sll.Node next_2 = new random.sll.Node();
		random.sll.Node next_4 = null;
		int elem_3 = 15;
		int elem_1 = -18;
		root.elem = elem_1;
		root.next = next_2;
		next_2.elem = elem_3;
		next_2.next = next_4;
		obj.withSin(root);
	}

	@Test
	public void test_withSin5() throws Exception {
		Input obj = new Input();
		random.sll.Node root = new random.sll.Node();
		random.sll.Node next_2 = new random.sll.Node();
		random.sll.Node next_4 = new random.sll.Node();
		random.sll.Node next_6 = new random.sll.Node();
		random.sll.Node next_8 = null;
		int elem_3 = 27;
		int elem_1 = 13;
		int elem_7 = -5;
		int elem_5 = 6;
		root.elem = elem_1;
		root.next = next_2;
		next_2.elem = elem_3;
		next_2.next = next_4;
		next_4.elem = elem_5;
		next_4.next = next_6;
		next_6.elem = elem_7;
		next_6.next = next_8;
		obj.withSin(root);
	}

	@Test
	public void test_withSin6() throws Exception {
		Input obj = new Input();
		random.sll.Node root = new random.sll.Node();
		random.sll.Node next_2 = new random.sll.Node();
		random.sll.Node next_4 = new random.sll.Node();
		random.sll.Node next_6 = null;
		int elem_3 = -31;
		int elem_1 = 27;
		int elem_5 = 31;
		root.elem = elem_1;
		root.next = next_2;
		next_2.elem = elem_3;
		next_2.next = next_4;
		next_4.elem = elem_5;
		next_4.next = next_6;
		obj.withSin(root);
	}

	@Test
	public void test_withSin7() throws Exception {
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
		int elem_13 = 26;
		int elem_9 = -5;
		int elem_11 = -9;
		int elem_15 = 19;
		int elem_3 = 7;
		int elem_1 = -1;
		int elem_7 = -3;
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
		obj.withSin(root);
	}

	@Test
	public void test_withSin8() throws Exception {
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
		int elem_13 = -3;
		int elem_9 = 15;
		int elem_11 = -21;
		int elem_17 = 29;
		int elem_15 = 23;
		int elem_3 = -13;
		int elem_1 = -3;
		int elem_7 = 23;
		int elem_5 = 29;
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
		obj.withSin(root);
	}

	@Test
	public void test_withSin9() throws Exception {
		Input obj = new Input();
		random.sll.Node root = null;
		obj.withSin(root);
	}

	@Test
	public void test_withSin10() throws Exception {
		Input obj = new Input();
		random.sll.Node root = new random.sll.Node();
		random.sll.Node next_2 = new random.sll.Node();
		random.sll.Node next_4 = new random.sll.Node();
		random.sll.Node next_6 = new random.sll.Node();
		random.sll.Node next_8 = new random.sll.Node();
		random.sll.Node next_10 = null;
		int elem_9 = 10;
		int elem_3 = -14;
		int elem_1 = -19;
		int elem_7 = 23;
		int elem_5 = -21;
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
		obj.withSin(root);
	}

}

