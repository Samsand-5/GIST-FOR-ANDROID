int numberOfEmailsInInbox = 0;
int numberOfDraftEmails = 2;
String emailMessage = "You have " + numberOfEmailsInInbox + " emails. ";
String draftMessage = "You have " + numberOfDraftEmails + " email drafts.";
if (numberOfEmailsInInbox == 0) {
    emailMessage = "You have no new messages. ";
}

if (numberOfDraftEmails == 0) {
    draftMessage = "You have no new drafts.";
}

Log.v("InboxActivity", emailMessage);
Log.v("InboxActivity", draftMessage);
