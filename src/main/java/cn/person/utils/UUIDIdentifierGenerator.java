package cn.person.utils;

import java.util.UUID;

public final class UUIDIdentifierGenerator {


	public static String generate() {
		return UUID.randomUUID().toString() ;
	}

}
