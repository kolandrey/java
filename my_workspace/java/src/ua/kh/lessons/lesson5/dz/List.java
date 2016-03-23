package ua.kh.lessons.lesson5.dz;

public class List {
	private Item head;
	private int size;

	public int getSize() {
		return size;
	}

	public List() {
	}

	public void add(Integer a) {
		if (head == null) {
			head = new Item(a, null);
		} else {
			Item temp = head;
			while (temp.getNext() != null) {
				temp = temp.getNext();
			}
			temp.setNext(new Item(a, null));
			size++;
		}
	}

	public void add(Integer a, int index) {
		if (index == 0) {
			head = new Item(a, head);
		} else {
			Item i = get(index - 1);
			i.setNext(new Item(a, i.getNext()));
		}
		size++;

	}

	public void remove(int index) {
		Item temp = get(index);
		if (index == 0) {
			head = temp.getNext();
		} else {
			Item i = get(index - 1);
			i.setNext(temp.getNext());
		}
		size--;
	}

	public Item get(int index) {
		int count = 0;
		if (index < 0 || index > size) {
			throw new IncorrectIndexException();
		} else {
			Item temp = head;
			while (count != index) {
				temp = temp.getNext();
				count++;
			}
			return temp;
		}
	}

	@Override
	public String toString() {
		String str = head.getValue() + " ";
		Item temp = head;
		while (temp.getNext() != null) {
			temp = temp.getNext();
			str += temp.getValue() + " ";
		}
		return str;
	}
}
