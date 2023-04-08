package com.example.courses

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.courses.data.Courses
import com.example.courses.ui.theme.CoursesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CoursesTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    CoursesApp()
                }
            }
        }
    }
}

@Composable
fun CoursesApp(){
    Column() {
        CoursesGridItem()
    }
}
@Composable
fun CoursesGridItem(){
    Card(
        modifier = Modifier.padding(8.dp),
        elevation = 8.dp
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(painter = painterResource(id = R.drawable.culinary),
                contentDescription = stringResource(id = R.string.culinary))
            Column(
                modifier = Modifier.padding(horizontal = 16.dp)

            ) {
                Text(text = stringResource(id = R.string.culinary),
                    fontWeight = FontWeight(weight =300),
                    fontSize = 14.sp)
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(painter = painterResource(id = R.drawable.ic_grain),
                        contentDescription = null,
                        modifier = Modifier.width(12.dp).height(12.dp).padding(end = 4.dp)
                        )
                    Text(text = "321", fontSize = 10.sp)
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    CoursesTheme {
        CoursesApp()
    }
}