package ch09;

public class AutoCloseableObj implements AutoCloseable {

	@Override
	public void close() throws Exception {
		System.out.println("���ҽ��� Close() �Ǿ����ϴ�.");
	}

}
