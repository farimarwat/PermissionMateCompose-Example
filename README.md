# PermissionMateCompose Example
An android JetPack Compose library to handle permissions gracefully.

Introducing "PermissionMate" - the ultimate Android Jetpack Compose library for seamless permission management. Empower your app with effortless permission handling, ensuring a smooth user flow. Simplify your development process and make your life easier by gracefully managing Android permissions with our powerful library. Say goodbye to complex rationales and let PermissionMate handle them gracefully, allowing you to focus on delivering a flawless user experience. Experience the smooth flow and enjoy the convenience of PermissionMate as it seamlessly integrates into your app's permission workflow.

### Implementation
```
  implementation 'io.github.farimarwat:permissionmate-compose:1.1'

```

### Preparing Permission List and create PermessionMateState
```
//creating list
val permission = listOf(
        PMate(Manifest.permission.CAMERA,false,"Camera permission is not necessary. You can skip it"),
        PMate(Manifest.permission.READ_CONTACTS,true,"Read contacts is necessary and you cannot deny it"),
        PMate(Manifest.permission.RECORD_AUDIO,false,"Record Audio is also not required")
    )
//creating state
val pms = rememberPermissionMateState(permissions = permission)
```

### Start Showing Permission Requests
```
 Button(onClick = { pms.start() }) {
            Text(text = "Permission")
        }
```
