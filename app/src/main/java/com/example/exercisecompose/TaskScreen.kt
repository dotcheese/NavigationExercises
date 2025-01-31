package com.example.exercisecompose

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview


@Composable
fun TaskManager(text: String, modifier: Modifier = Modifier) {
    Column {
        Image(
            painter = painterResource(R.drawable.fametro_banner),
            contentDescription = null
        )
        Text("test")
    }

}

@Preview(showBackground = true)
@Composable
fun TaskManagerPreview() {
    TaskManager("test")
}

