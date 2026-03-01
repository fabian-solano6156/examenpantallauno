package com.example.myapplication1.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pantallauno.R
@Preview(showBackground = true)
@Composable
fun Pantalla1decordi(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFEFEFEF))
    ){
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(80.dp)
                .background(Color.White),
            contentAlignment = Alignment.Center
        ){
            Text(
                "Onion Math",
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold
            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ){
            Row(verticalAlignment = Alignment.CenterVertically) {
                Image(
                    painter = painterResource(com.example.pantallauno.R.drawable.imagen1),
                    contentDescription = null,
                    modifier = Modifier
                        .size(60.dp)
                        .clip(CircleShape),
                    contentScale = ContentScale.Crop
                )
                Spacer(modifier = Modifier.width(10.dp))
                Column {
                    Text(
                        "kyzamiz",
                        fontWeight = FontWeight.Bold,
                        fontSize = 18.sp
                    )
                    Text(
                        "Grade 4",
                        fontSize = 14.sp,
                        color = Color.Gray
                    )
                }
            }
            Box(
                modifier = Modifier
                    .background(Color(0xFFFFE0E6), RoundedCornerShape(10.dp))
                    .padding(horizontal = 12.dp, vertical = 8.dp)
            ){
                Text(" Grade")
            }
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ){
            Text("Start", fontSize = 25.sp)
        }
        Spacer(modifier = Modifier.height(20.dp))
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                .padding(horizontal = 16.dp)
                .background(Color(0xFF8BC34A), RoundedCornerShape(20.dp))
        ){

            Column(
                modifier = Modifier
                    .align(Alignment.CenterStart)
                    .padding(20.dp)
            ){
                Text(
                    "Numbers",
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )

                Text(
                    "Hello cuddly numbers!",
                    color = Color.White
                )
                Spacer(modifier = Modifier.height(10.dp))
                Box(
                    modifier = Modifier
                        .background(Color.White, RoundedCornerShape(20.dp))
                        .padding(horizontal = 20.dp, vertical = 8.dp)
                ){
                    Text("Start", color = Color.Black)
                }
            }
            Image(
                painter = painterResource(com.example.pantallauno.R.drawable.imagen4),
                contentDescription = null,
                modifier = Modifier
                    .align(Alignment.BottomEnd)
                    .size(120.dp)
            )
        }
        Spacer(modifier = Modifier.height(20.dp))
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 40.dp)
        ){
            Text("Courses", fontSize = 20.sp)
        }
        Spacer(modifier = Modifier.height(10.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)
        ){
            Column {
                Box(
                    modifier = Modifier
                        .size(100.dp)
                        .background(Color.White, RoundedCornerShape(15.dp)),
                    contentAlignment = Alignment.Center
                ){
                    Image(
                        painter = painterResource(com.example.pantallauno.R.drawable.imagen2),
                        contentDescription = null,
                        modifier = Modifier.size(120.dp)
                    )
                }
                Spacer(modifier = Modifier.height(10.dp))
                Box(
                    modifier = Modifier
                        .size(100.dp)
                        .background(Color.White, RoundedCornerShape(15.dp)),
                    contentAlignment = Alignment.Center
                ){
                    Image(
                        painter = painterResource(com.example.pantallauno.R.drawable.imagen3),
                        contentDescription = null,
                        modifier = Modifier.size(120.dp)
                    )
                }
            }
            Spacer(modifier = Modifier.width(15.dp))
            Column(
                modifier = Modifier.height(250.dp)
            ) {
                Spacer(modifier = Modifier.height(30.dp))
                Column {
                    Text("Try for 7 Days", fontWeight = FontWeight.Bold)
                    Text("Start on Aug 1st", fontSize = 12.sp, color = Color.Gray)
                }

                Spacer(modifier = Modifier.height(80.dp))

                Column {
                    Text("Autumn Term", fontWeight = FontWeight.Bold)
                    Text("Start on Sep 1st", fontSize = 12.sp, color = Color.Gray)
                }
            }
            Spacer(modifier = Modifier.width(70.dp))
            Box(
                modifier = Modifier
                    .height(250.dp)
                    .fillMaxWidth()
            ) {

                Column(
                    modifier = Modifier
                        .align(Alignment.TopStart)
                        .offset(y = 20.dp)
                ) {
                    Text(
                        "$9.9",
                        color = Color.Red,
                        fontWeight = FontWeight.Bold,
                        fontSize = 18.sp
                    )

                    Spacer(modifier = Modifier.height(10.dp))

                    Text(
                        "$98",
                        color = Color.Gray,
                        fontSize = 16.sp
                    )
                }
                Column(
                    modifier = Modifier
                        .align(Alignment.TopStart)
                        .offset(y = 130.dp)
                ) {
                    Text(
                        "$398",
                        color = Color.Red,
                        fontWeight = FontWeight.Bold,
                        fontSize = 18.sp
                    )

                    Spacer(modifier = Modifier.height(10.dp))

                    Text(
                        "$1288",
                        color = Color.Gray,
                        fontSize = 16.sp
                    )
                }
            }
        }
    }
}
