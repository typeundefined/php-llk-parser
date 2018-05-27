/*
 * $Id: MarkedAST.java 43 2012-06-18 20:38:49Z const.nekrasoff@gmail.com $
 * 
 * Author: Konstantin Nekrasov
 * Created: Mar 11, 2012
 */
package php.parser.antlr.ast;

import antlr.CommonAST;
import antlr.Token;

public class MarkedAST extends CommonAST {
	private int line;
	private int column;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6950838849423434665L;

	@Override
	public void initialize(Token tok) {
		super.initialize(tok);
		line = tok.getLine();
		column = tok.getColumn();
	}

	public int getLine() {
		return line;
	}

	public int getColumn() {
		return column;
	}	
}
