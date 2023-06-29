public enum Square
{
	X,
	O,
	BLANK {
		public String toString()
		{
			return("_");
		}
	}
}