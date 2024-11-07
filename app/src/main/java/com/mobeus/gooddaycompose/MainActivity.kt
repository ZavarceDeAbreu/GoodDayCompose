package com.mobeus.gooddaycompose

import android.content.ClipData.Item
import android.graphics.Color.rgb
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mobeus.gooddaycompose.ui.theme.GoodDayComposeTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ViewContainer()
        }

    }


    @Preview(showBackground = true)
    @Composable
    fun ViewContainer() {
        Scaffold (
            content = {Content()}
        )
    }


    @Preview(showBackground = true)
    @Composable
    fun Content() {
        var counter by rememberSaveable { mutableIntStateOf(0) }

        LazyColumn(
            Modifier
                .fillMaxSize()
                .background(Color(rgb(226, 241, 231)))
                .padding(20.dp)
        ) {
            item() {
                Image(
                    painter = painterResource(id = R.drawable.cat),
                    contentDescription = " a cat",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp)
                )
                Row(modifier = Modifier.padding(top = 8.dp)) {
                    Image(
                        painter = painterResource(id = R.drawable.baseline_favorite_24),
                        contentDescription = "like",
                        modifier = Modifier.clickable { counter++ })
                    Text(
                        text = counter.toString(),
                        color = Color(rgb(36, 54, 66)),
                        modifier = Modifier.padding(start = 4.dp),
                        textAlign = TextAlign.Center
                    )
                }
                Text(
                    text = "Mobeus Technologist",
                    fontSize = 32.sp,
                    color = Color(rgb(36, 54, 66)),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 16.dp),
                    textAlign = TextAlign.Center
                )
                Text(
                    text = "Esto es una prueba de Columnas",
                    color = Color(rgb(56, 116, 120)),
                    modifier = Modifier.padding(vertical = 10.dp)
                )
                Text(
                    text = "Comlumna 3",
                    color = Color(rgb(56, 116, 120)),
                    modifier = Modifier.padding(vertical = 10.dp)
                )
                Text(
                    text = "Columna 4",
                    color = Color(rgb(56, 116, 120)),
                    modifier = Modifier.padding(vertical = 10.dp)
                )
            }
        }
    }
}

