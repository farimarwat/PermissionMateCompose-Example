package com.farimarwat.permissionmatecompose_example

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.farimarwat.permissionmate.PMate
import com.farimarwat.permissionmate.rememberPermissionMateState
import com.farimarwat.permissionmatecompose_example.ui.theme.PermissionMateComposeExampleTheme
import android.Manifest
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PermissionMateComposeExampleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                   MainApp()
                }
            }
        }
    }
}

@Composable
fun MainApp(){
    val permission = listOf(
        PMate(Manifest.permission.CAMERA,false,"Camera permission is not necessary. You can skip it"),
        PMate(Manifest.permission.READ_CONTACTS,true,"Read contacts is necessary and you cannot deny it"),
        PMate(Manifest.permission.RECORD_AUDIO,false,"Record Audio is also not required")
    )
    val pms = rememberPermissionMateState(permissions = permission)
    Column(modifier = Modifier.fillMaxSize()) {
        Button(onClick = { pms.start() }) {
            Text(text = "Permission")
        }
    }
}