package Java8.Java8_Stream;

import java.util.List;

public class Detail {
	private int key;
	private List list;

	public Detail() {
	}

	public Detail(int key, List list) {

		this.key = key;
		this.list = list;
	}

	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}

	public List getList() {
		return list;
	}

	public void setList(List list) {
		this.list = list;
	}
}
