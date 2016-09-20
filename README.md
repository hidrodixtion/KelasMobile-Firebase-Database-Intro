## Presentation for KelasMobile Meetup 3 (2016/09/20)
### Topic : Intro To Firebase Realtime Database

Before you build:
- Download `google-services.json` from your firebase project.
- Firebase default setting only allow authenticated users to access the database. You can change it so unauthenticated user is allowed.
    - Go to Firebase > Database > Rule and change the content into :
    ```json
    {
        "rules": {
            ".read": true,
            ".write": true
        }
    }
    ```
    - Please **ONLY** do this in development mode. **DO NOT** do this in Production.
- Uncomment line 16 in `SimpleBaseApplication.java` to show firebase connectivity logs.
