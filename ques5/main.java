package ques5;

class LoanReceipt
{
    private final String memberId;
    private final String[] bookIds;

    public LoanReceipt(String memberId, String[] bookIds)
    {
        this.memberId = memberId;

        
        this.bookIds = bookIds.clone();
    }

    public String[] getBookIds()
    {
        // Defensive copy while leaving
        return bookIds.clone();
    }

    public LoanReceipt withCorrectedBookId(int index, String newId)
    {
        String[] newBookIds = bookIds.clone();

        newBookIds[index] = newId;

        return new LoanReceipt(memberId, newBookIds);
    }
}
