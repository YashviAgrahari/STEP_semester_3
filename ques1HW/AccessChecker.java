package ques1HW;

public class AccessChecker
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
                accessorContext.equals("SAME_PACKAGE"))
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

    static String summarizeBatch(String[][] attempts)
    {
        int allowed = 0;
        int denied = 0;

        for (int i = 0; i < attempts.length; i++)
        {
            if (classifyAccess(attempts[i][0], attempts[i][1])
                    .equals("ALLOWED"))
                allowed++;
            else
                denied++;
        }

        return "Allowed: " + allowed + " | Denied: " + denied;
    }
}
