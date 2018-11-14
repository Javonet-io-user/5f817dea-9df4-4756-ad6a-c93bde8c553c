package jio.System.Windows.Forms; public enum CharacterCasing{Normal(0L),Upper(1L),Lower(2L),; private long numVal;CharacterCasing(long numVal) {
		        this.numVal = numVal;
		    }
		
		    public long getNumVal() {
		        return numVal;
		    }
            }