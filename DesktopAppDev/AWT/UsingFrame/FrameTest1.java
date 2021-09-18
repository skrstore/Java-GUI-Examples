import java.awt.Button;
import java.awt.Frame;

class FrameTest1 {
	FrameTest1() {
		Frame f1 = new Frame();
		f1.setSize(400, 400);
		f1.setVisible(true);
	}

	public static void main(String[] args) {
		new FrameTest1();
	}
}

class FrameTest2 {
	public static void main(String[] args) {
		Frame f1 = new Frame("Demo Frame");
		f1.setSize(400, 400);
		f1.setVisible(true);
	}
}

class FrameTest3 extends Frame {
	private static final long serialVersionUID = 1L;

	FrameTest3() {
		setSize(400, 400);
		setVisible(true);
	}

	public static void main(String[] args) {
		new FrameTest3();
	}
}
