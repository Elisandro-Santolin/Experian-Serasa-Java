package enumerators;

public enum StatusEnum {
    SINGLE,
    MARRIED,
    SEPARATED,
    DIVORCED,
    WIDOWER;

	public boolean isSingle(){
	return this==SINGLE;
    }
    public boolean isMarried(){
    return this==MARRIED;
    }
	public boolean isSeparated(){
    return this==SEPARATED;
    }
    public boolean isDivorced(){
	return this==DIVORCED;
	}
    public boolean isWidower(){
    return this==WIDOWER;
	}
	
public Character getAsChar(){
		
	Character value = null;
		
	switch (this) {
	case SINGLE:
		value = 'S';
		break;
	case MARRIED:
		value = 'M';
		break;
    case SEPARATED:
        value = 'P';
        break;
    case DIVORCED:
        value = 'D';
        break;
    case WIDOWER:
        value = 'W';
        break;
        }		
	return value;
	}
}

