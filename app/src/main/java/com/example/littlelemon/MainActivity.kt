package com.example.littlelemon

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RestaurantTitle(name = stringResource(id =  R.string.title),
            size = 32)
        }
    }
}

@Composable
fun RestaurantTitle(name : String, size: Int){
    Text(text = name, fontSize = size.sp, color = Color(0xFFF4CE14))
}
@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Text(text = "Little Lemon", fontSize = 32.sp,
        color = Color(0xFFF4CE14))
}