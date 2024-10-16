package com.pam.p2_basic_composs

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.pam.p2_basic_composs.ui.theme.P2_Basic_CompossTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            P2_Basic_CompossTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    BasicLayout(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun BasicLayout(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp), // Tambahan padding untuk ruang antar elemen
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        // Title "LogIn" dengan style yang lebih besar dan tebal
        Text(
            text = "LogIn",
            style = TextStyle(
                fontSize = 50.sp,
                fontWeight = FontWeight.Bold
            )
        )

        // Sub-judul atau keterangan halaman login
        Text(
            text = "Ini adalah halaman login",
            modifier = Modifier.padding(bottom = 16.dp)
        )

        // Gambar logo UMY
        Image(
            painter = painterResource(id = R.drawable.umylogo),
            contentDescription = "Login Image",
            modifier = Modifier
                .size(300.dp)
        )

        // Name label
        Text(
            text = "Nama",
            style = TextStyle(fontSize = 18.sp),
            modifier = Modifier.padding(bottom = 8.dp)
        )

        // Name of the user (in red color)
        Text(
            text = "Muhamad Farhan",
            style = TextStyle(fontSize = 18.sp, color = Color.Red),
            modifier = Modifier.padding(bottom = 8.dp)
        )

        // ID number (in bold)
        Text(
            text = "20220140139",
            style = TextStyle(fontSize = 32.sp, fontWeight = FontWeight.Bold),
            modifier = Modifier.padding(bottom = 16.dp)

        )

        // Image of the user
        Image(
            painter = painterResource(id = R.drawable.userimage), // Add your user image here
            contentDescription = "User Image",
            modifier = Modifier
                .size(300.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    P2_Basic_CompossTheme {
        BasicLayout()
    }
}
