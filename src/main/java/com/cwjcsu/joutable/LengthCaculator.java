/*$Id: $
 * author   date   comment
 * cwjcsu@gmail.com  2016年5月19日  Created
*/
package com.cwjcsu.joutable;

public interface LengthCaculator {
	public int charWidth(char ch);
	
	int length(String str);
	
	String substring(String string, int start, int end);
	
	String substring(String string,int beginIndex);
}
