package com.zftlive.android.library.third.ormlite.field.types;

import com.zftlive.android.library.third.ormlite.field.SqlType;

/**
 * Type that persists a float primitive.
 * 
 * @author graywatson
 */
public class FloatType extends FloatObjectType {

	private static final FloatType singleTon = new FloatType();

	public static FloatType getSingleton() {
		return singleTon;
	}

	private FloatType() {
		super(SqlType.FLOAT, new Class<?>[] { float.class });
	}

	/**
	 * Here for others to subclass.
	 */
	protected FloatType(SqlType sqlType, Class<?>[] classes) {
		super(sqlType, classes);
	}

	@Override
	public boolean isPrimitive() {
		return true;
	}
}
