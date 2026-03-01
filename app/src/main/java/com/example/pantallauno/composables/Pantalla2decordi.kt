package com.example.pantallauno.composables

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
fun Pantalla2decordi(){

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFEFEFEF)),
        horizontalAlignment = Alignment.CenterHorizontally
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
        Spacer(modifier = Modifier.height(15.dp))
        Image(
            painter = painterResource(com.example.pantallauno.R.drawable.imagen1),
            contentDescription = null,
            modifier = Modifier
                .size(120.dp)
                .clip(CircleShape),
            contentScale = ContentScale.Crop
        )

        Spacer(modifier = Modifier.height(10.dp))
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Text(
                "kyzamiz",
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp
            )
            Text(
                "Grade 4",
                fontSize = 14.sp,
                color = Color.Gray
            )
        }
        Spacer(modifier = Modifier.height(20.dp))

        Box(
            modifier = Modifier
                .width(300.dp)
                .background(Color(0xFFDBDBDB), RoundedCornerShape(20.dp))
                .padding(horizontal = 20.dp, vertical = 10.dp)
        ){
            Text("Deadline is coming!")
        }
        Spacer(modifier = Modifier.height(20.dp))
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp)
        ){
            Text(
                "Learning",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )
        }

        Spacer(modifier = Modifier.height(10.dp))
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(150.dp)
                .padding(horizontal = 16.dp)
                .background(Color(0xFF9292FF), RoundedCornerShape(10.dp))
        ){
            Column(
                modifier = Modifier
                    .align(Alignment.CenterStart)
                    .padding(20.dp)
            ){
                Text(
                    "Autumn Term",
                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp
                )
                Text(
                    "Week 1",
                    color = Color.White,
                    fontSize = 14.sp
                )

                Spacer(modifier = Modifier.height(10.dp))

                Box(
                    modifier = Modifier
                        .background(Color.White, RoundedCornerShape(20.dp))
                        .padding(horizontal = 20.dp, vertical = 8.dp)
                ){
                    Text("Start")
                }
            }

            Image(
                painter = painterResource(com.example.pantallauno.R.drawable.imagen5),
                contentDescription = null,
                modifier = Modifier
                    .align(Alignment.BottomEnd)
                    .size(210.dp)
            )
        }
        Spacer(modifier = Modifier.height(20.dp))
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(150.dp)
                .padding(horizontal = 16.dp)
                .background(Color(0xFF64D3FF), RoundedCornerShape(10.dp))
        ){
            Column(
                modifier = Modifier
                    .align(Alignment.CenterStart)
                    .padding(20.dp)
            ){
                Text(
                    "Try for 7 Days",
                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp
                )
                Text(
                    "Day 2",
                    color = Color.White,
                    fontSize = 14.sp
                )

                Spacer(modifier = Modifier.height(10.dp))

                Box(
                    modifier = Modifier
                        .background(Color.White, RoundedCornerShape(20.dp))
                        .padding(horizontal = 20.dp, vertical = 8.dp)
                ){
                    Text("Start")
                }
            }

            Image(
                painter = painterResource(com.example.pantallauno.R.drawable.imagen6),
                contentDescription = null,
                modifier = Modifier
                    .align(Alignment.BottomEnd)
                    .size(210.dp)
            )
        }
    }
}