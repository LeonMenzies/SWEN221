package swen221.database.lang;

import java.util.ArrayList;

public class DatabaseImpl implements Database {

	private ColumnType[] schema;
	private int keyField;
	private ArrayList<Object[]> row;

	public DatabaseImpl(ColumnType[] schema2, int kf, ArrayList<Object[]> r) {
		this.schema = schema2;
		this.keyField = kf;
		this.row = r;
	}

	@Override
	public ColumnType[] getSchema() {
		return schema;
	}

	@Override
	public int getKeyField() {
		return keyField;
	}

	@Override
	public int size() {
		return row.size();
	}

	@Override
	public void addRow(Object... data) throws InvalidRowException, DuplicateKeyException {

		if (data.length == schema.length) {
			for (int i = 0; i < data.length; i++) {
				if (!schema[i].getType().isInstance(data[i])) {
					throw new InvalidRowException();
				}
			}
			for (Object[] o : row) {
				if (data[keyField].equals(o[keyField])) {
					throw new DuplicateKeyException();
				}
			}
			row.add(data);

		} else {
			throw new InvalidRowException();
		}
	}

	@Override
	public Object[] getRow(Object key) throws InvalidKeyException {

		Object[] toReturn = null;

		for (Object[] obj : row) {
			if (obj[keyField].equals(key)) {
				toReturn = obj;
			}
		}

		if (toReturn != null) {
			return toReturn;
		} else {
			throw new InvalidKeyException();
		}

	}

	@Override
	public Object[] getRow(int index) throws IndexOutOfBoundsException {
		if (index >= 0 && index < row.size()) {
			return row.get(index);
		} else {
			throw new IndexOutOfBoundsException();
		}
	}
}
