package jsontest;

public class MyObj {
	private String foo;
	private Number num;
	public MyObj() {
		this.foo = "Hey foo";
		this.num = 1;
	}
	
	public MyObj(String foo, Number num) {
		this.foo = foo;
		this.num = num;
	}
	
	public String getFoo() {
		return foo;
	}
	
	public Number getNum() {
		return num;
	}
	
}
