package demo8;

public class Convert {
    public static Object changeType(String parameterType, String value) {
        switch (parameterType) {
            case "int":
                return Integer.parseInt(value);
            case "float":
                Float.parseFloat(value);
            case "double":
                return Double.parseDouble(value);
            case "long":
                return Long.parseLong(value);
            default:
                break;
        }
        return null;
    }
}
