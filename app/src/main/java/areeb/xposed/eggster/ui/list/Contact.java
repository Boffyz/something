package areeb.xposed.eggster.ui.list;

import areeb.xposed.eggster.R;

public class Contact {
    public String url, description;
    public int resId;

    public Contact(String url, String description, int resId) {
        this.url = url;
        this.description = description;
        this.resId = resId;
    }

    public static Contact[] getContacts() {
        Contact[] contacts = {
                new Contact("https://github.com/Boffyz/something",
                        "Source Code (this fork)", R.drawable.ic_git),          // Github (fork)
                new Contact("https://github.com/iamareebjamal/eggster_xposed",
                        "Original project", R.drawable.ic_git),                 // Github (upstream)
                new Contact("http://forum.xda-developers.com/xposed/modules/xposed-eggster-1-2-replace-easter-eggs-t2758583",
                        "XDA (original thread)", R.drawable.ic_xda),            // XDA
        };

        return contacts;
    }
}
