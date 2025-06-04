package com.example.tomandjerry.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomandjerry.R
import com.example.tomandjerry.spacer.SpaceHorizontal8
import com.example.tomandjerry.ui.theme.BackGround
import com.example.tomandjerry.ui.theme.PrimaryText
import com.example.tomandjerry.ui.theme.SecondaryText

@Composable
fun TopBar(
    modifier: Modifier = Modifier,
    title: String ,
    subtitle: String,
    profileImage: Int,
){
   Row(
       modifier = modifier
           .background(BackGround)
           .fillMaxWidth()
           .height(56.dp),

       horizontalArrangement = Arrangement.SpaceBetween,
       verticalAlignment = Alignment.CenterVertically

   ) {
       Image(
           painter = painterResource(id = profileImage),
           contentDescription = null,
           modifier = Modifier
               .clip(RoundedCornerShape(12))
               .size(width = 48.dp, height = 48.dp),
           contentScale = ContentScale.Crop

       )
      SpaceHorizontal8()

       Column {
           Text(
               modifier = Modifier
                   .size(width = 72.dp, height = 21.dp),
               text = title,
               fontSize = 14.sp,
               color = PrimaryText,
               fontWeight = FontWeight(500)
           )
           Text(
               modifier = Modifier.size(width = 170.dp, height = 18.dp),
               text =subtitle,
               fontSize = 12.sp,
               fontWeight = FontWeight(400),
           color = SecondaryText,
           )
       }
       Spacer(modifier = Modifier.weight(1f))

       Image(
           painter = painterResource(id=R.drawable.useravatar),
           contentDescription = null,
           modifier = modifier
               .width(40.dp)
               .height(50.dp)
               .clip(RoundedCornerShape(12.dp)),
           contentScale = ContentScale.Fit
       )

   }
}