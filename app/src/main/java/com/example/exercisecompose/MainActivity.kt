package com.example.exercisecompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.exercisecompose.ui.theme.ExerciseComposeTheme
import androidx.navigation.compose.rememberNavController


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ExerciseComposeTheme {
                val navController = rememberNavController()
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Navigation(navController = navController)
                }
            }
        }
    }
}

@Composable
fun TutorialMessage(text: String, modifier: Modifier = Modifier) {
    Column {
        Image(
            painter = painterResource(R.drawable.bg_compose_background),
            contentDescription = null

        )
        Text(
            text = text,
            textAlign = TextAlign.Center,
            fontSize = 24.sp,
            modifier = modifier.padding(16.dp)

        )
        Text(
            text = stringResource(R.string.text_2),
            textAlign = TextAlign.Justify,
            fontSize = 24.sp,
            modifier = modifier.padding(16.dp)

        )
        Text(
            text = stringResource(R.string.text_3),
            textAlign = TextAlign.Justify,
            fontSize = 24.sp,
            modifier = modifier.padding(16.dp)

        )
        Button(
            onClick = { },
            colors = ButtonDefaults.buttonColors(containerColor = Color.Green),
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier.padding(8.dp).width(120.dp).height(40.dp)
        ) {
            Text("I Understood")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ExercisePreview() {
    ExerciseComposeTheme {
        TutorialMessage(stringResource(R.string.jetpack_compose_tutorial))
    }
}