/*
 * generated by Xtext 2.9.1
 */
package it.polimi.xtext.tosca4cloudifydsl.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class DslAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("it/polimi/xtext/tosca4cloudifydsl/parser/antlr/internal/InternalDsl.tokens");
	}
}
