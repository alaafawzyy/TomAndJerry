package com.example.tomandjerry.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomandjerry.ui.theme.LightSkyBlue

@Composable
    fun DetailsCard(
        title: String,
        description: String,
        image: Int
    ){
        Card(modifier = Modifier.size(104.dp).clip(RoundedCornerShape(12.dp))

            .background(LightSkyBlue), shape = RoundedCornerShape(12.dp)
            ){
            Column (modifier = Modifier
                .padding(12.dp)
                .fillMaxSize()
                , verticalArrangement = Arrangement.SpaceBetween,
                horizontalAlignment = Alignment.CenterHorizontally)
            {
              Image(
                  painter = painterResource(id = image),
                  contentDescription = null,
                  modifier = Modifier.size(32.dp)
              )
                Text(
                    text = title,
                    color = Color(0xFF888686),
                            modifier = Modifier.width(58.dp)
                        .height(16.dp),
                    fontSize = 14.sp,
                    fontWeight = FontWeight(500),

                )
                Text(
                    text = description,
                     modifier = Modifier.width(29.dp)
                        .height(16.dp),
                    fontSize = 12.sp,
                    fontWeight = FontWeight(500),
                    color = Color(0xFF888686)
                )
            }

        }

}