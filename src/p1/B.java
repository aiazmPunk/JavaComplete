package p1;

class B implements A.NestedIf {

	public boolean isNotNegative(int x) {

		return x < 0 ? false : true;
	}
}