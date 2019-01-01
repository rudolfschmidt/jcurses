package com.rudolfschmidt.jcurses.types;

import com.sun.jna.Structure;

import java.lang.reflect.Field;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CChar extends Structure {

	public Attribute attr;
	public char[] chars;
	public int ext_color;

	@Override
	protected List<String> getFieldOrder() {
		return Stream.of(getClass().getDeclaredFields()).map(Field::getName).collect(Collectors.toList());
	}
}