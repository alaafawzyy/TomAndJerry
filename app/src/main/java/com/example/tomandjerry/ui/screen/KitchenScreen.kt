package com.example.tomandjerry.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomandjerry.R
import com.example.tomandjerry.ui.components.DetailsCard
import com.example.tomandjerry.ui.theme.DarkBlue
import com.example.tomandjerry.ui.theme.PrimaryText
import com.example.tomandjerry.ui.theme.SecondaryText

@Composable
fun KitchenScreen() {
Column (modifier = Modifier.background(Color(0XFF3548480))
    .fillMaxSize()){
    Box(modifier = Modifier
        .padding(top = 200.dp)
        .background(Color.White)
        .fillMaxWidth()
        .fillMaxHeight())
        {
    Column (
        modifier = Modifier.fillMaxSize()
            .padding(horizontal = 16.dp, vertical = 32.dp)
        //.clip(RoundedCornerShape(16.dp))

    ) {
        Row(Modifier.fillMaxWidth().height(58.dp), horizontalArrangement = Arrangement.SpaceBetween)
        {
            Column(
                modifier = Modifier.width(196.dp).height(58.dp),
                verticalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "Electric Tom pasta",
                    color = PrimaryText,
                    modifier = Modifier.width(178.dp),
                    fontWeight = FontWeight(500),
                    fontSize = 20.sp,
                )
                Row(
                    modifier = Modifier.width(91.dp).height(30.dp)
                        // .padding(top = 4.dp, bottom = 4.dp)
                        .clip(RoundedCornerShape(12))
                        .background(Color(0xFFD0E5F0)),
                    verticalAlignment = Alignment.CenterVertically,

                    ) {
                    Image(
                        painter = painterResource(id = R.drawable.money_bag_01),
                        contentDescription = stringResource(R.string.money_bag),

                        modifier = Modifier
                            .padding(top = 7.dp, bottom = 7.dp, start = 8.dp)
                            .size(16.dp)

                    )

                    Text(
                        text = "5 cheeses",
                        fontSize = 12.sp,
                        fontWeight = FontWeight(500),
                        color = DarkBlue,
                        modifier = Modifier
                            .padding(start = 4.dp)
                            .width(55.dp).height(18.dp)
                            .wrapContentHeight(align = Alignment.CenterVertically)
                    )
                }
            }
            Image(
                painterResource(id = R.drawable.favorite_icon),
                contentDescription = null,
                alignment = Alignment.CenterEnd,

                modifier = Modifier.size(24.dp).align(Alignment.CenterVertically)
            )

        }

    Text(
        text = "Pasta cooked with a charger cable and sprinkled with questionable cheese. Make sure to unplug it before eating (or not, you decide).",
        color = SecondaryText,
        modifier = Modifier
            .padding(top = 16.dp)
        .fillMaxWidth()
            .height(60.dp),

        fontSize = 14.sp,
        fontWeight = FontWeight(500)
    )
        Text(
           text = "Details",
            color = PrimaryText,
            modifier = Modifier
                .padding(top = 24.dp)
                .fillMaxWidth()
                .height(16.dp),

            fontSize = 18.sp,
            fontWeight = FontWeight(500)
        )

        Row (modifier = Modifier.padding(top = 8.dp).fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(8.dp) ){
           DetailsCard(title =" 1000 V", description = "Temperature", image = R.drawable.temperature)
            DetailsCard(title =" 3 sparks", description = "Time", image = R.drawable.timer_02)
            DetailsCard(title ="1M 12K", description = "No. of deaths", image = R.drawable.evil)



        }

        Text(
            text = "Preparation method",
            color = PrimaryText,
            modifier = Modifier
                .padding(top = 24.dp)
                .width(328.dp)
                .height(16.dp),
            fontSize = 18.sp,
            fontWeight = FontWeight(500)
        )


    }
}}

}