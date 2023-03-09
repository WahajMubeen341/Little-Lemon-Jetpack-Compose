package com.example.littlelemon

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.provider.FontsContractCompat.Columns

class MainActivity : ComponentActivity() {
    var username : String = ""
    var password : String = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//            RestaurantTitle(name = stringResource(id =  R.string.title),
//            size = 32)

//            Column(Modifier.fillMaxSize(),
//            verticalArrangement = Arrangement.Center,
//            horizontalAlignment = Alignment.CenterHorizontally) {
//                Text(text = stringResource(id = R.string.title), fontSize = 32.sp, color = Color(0xFFF4CE14))
//                Text(text = stringResource(id = R.string.city), fontSize = 32.sp, color = Color(0xFFF4CE14))
//                Button(onClick = { /*TODO*/ },
//                border = BorderStroke(1.dp, Color.Red),
//                shape = RoundedCornerShape(10.dp)
//
//                ) {
//                    Text(text = stringResource(id = R.string.add))
//                }
//            }


            /**Exercise one*/
            Column(Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally) {
                Text(text = stringResource(id = R.string.little), fontSize = 30.sp, color = Color.DarkGray)
                Image(painter = painterResource(id = R.drawable.iota_logo_black), modifier = Modifier.size(100.dp, 100.dp),  contentDescription = stringResource(id = R.string.description) )
                Text(text = stringResource(id = R.string.lemon), fontSize = 30.sp, color = Color.DarkGray)


                OutlinedTextField(value = username, onValueChange = {newText ->
                    username = newText}, placeholder = { Text(text = "Username") }
                )

                OutlinedTextField(value = password, onValueChange = {newText ->
                    password = newText}, placeholder = { Text(text = "Password") },
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
                )
                Button(
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(
                        Color(0xFF495E57)
                    )
                ) {
                    Text(
                        text = "Login",
                        color = Color(0xFFEDEFFE)
                    )
                }

            }


            /**end*/

//      LoginScreen(username, password)


        }
    }
}


@Composable
fun LoginScreen(username: String, password: String){
    /**Exercise one*/
//    Column(Modifier.fillMaxSize(),
//        verticalArrangement = Arrangement.Center,
//        horizontalAlignment = Alignment.CenterHorizontally) {
//        Text(text = stringResource(id = R.string.little), fontSize = 30.sp, color = Color.DarkGray)
//        Image(painter = painterResource(id = R.drawable.iota_logo_black), modifier = Modifier.size(100.dp, 100.dp),  contentDescription = stringResource(id = R.string.description) )
//        Text(text = stringResource(id = R.string.lemon), fontSize = 30.sp, color = Color.DarkGray)
//
//
//        OutlinedTextField(value = username, onValueChange = {newText ->
//            username = newText}, placeholder = { Text(text = "Username") }
//        )
//
//        OutlinedTextField(value = password, onValueChange = {newText ->
//            password = newText}, placeholder = { Text(text = "Password") },
//            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
//        )
//        Button(
//            onClick = { /*TODO*/ },
//            colors = ButtonDefaults.buttonColors(
//                Color(0xFF495E57)
//            )
//        ) {
//            Text(
//                text = "Login",
//                color = Color(0xFFEDEFEE)
//            )
//        }
//
//    }


    /**end*/
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