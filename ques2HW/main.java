package ques2HW;

class AccessChecker
{
    static String classifyAccess(String fieldModifier, String accessorContext)
    {
        if (fieldModifier.equals("private"))
        {
            if (accessorContext.equals("SAME_CLASS"))
                return "ALLOWED";
            else
                return "DENIED";
        }

        if (fieldModifier.equals("default"))
        {
            if (accessorContext.equals("SAME_CLASS") ||
                accessorContext.equals("SAME_PACKAGE"))
                return "ALLOWED";
            else
                return "DENIED";
        }

        if (fieldModifier.equals("protected"))
        {
            if (accessorContext.equals("SAME_CLASS") ||
                accessorContext.equals("SAME_PACKAGE") ||
                accessorContext.equals("SUBCLASS_DIFFERENT_PACKAGE_OWN_TYPE"))
                return "ALLOWED";
            else
                return "DENIED";
        }

        if (fieldModifier.equals("public"))
        {
            return "ALLOWED";
        }

        return "DENIED";
    }
}
