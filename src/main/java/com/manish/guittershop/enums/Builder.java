package com.manish.guittershop.enums;

public enum Builder {
	FENDER, MARTIN, GIBSON, COLLINGS, OLSON, RYAN, PRS, ANY;

	public String toString() {
		switch (this) {
		case ANY:
			return "Any";
		case COLLINGS:
			return "Collings";
		case FENDER:
			return "Fender";
		case GIBSON:
			return "Gibson";
		case MARTIN:
			return "Martin";
		case OLSON:
			return "Olson";
		case PRS:
			return "Prs";
		case RYAN:
			return "Ryan";
		}
		return "unspecified";
	}

}
