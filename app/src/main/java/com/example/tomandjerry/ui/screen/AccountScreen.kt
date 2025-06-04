package com.example.tomandjerry.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomandjerry.R
import com.example.tomandjerry.data.favoriteFoods
import com.example.tomandjerry.data.statsCards
import com.example.tomandjerry.data.tomSettings
import com.example.tomandjerry.spacer.SpaceVertical12
import com.example.tomandjerry.spacer.SpaceVertical8
import com.example.tomandjerry.ui.components.TomStatsCard
import com.example.tomandjerry.ui.components.TomAccountItem
import com.example.tomandjerry.ui.theme.AccountBackground
import com.example.tomandjerry.ui.theme.Gray60
import com.example.tomandjerry.ui.theme.PrimaryText
import com.example.tomandjerry.ui.theme.White
import com.example.tomandjerry.ui.theme.White80

@Composable
fun AccountScreen() {
    Column(modifier = Modifier.fillMaxSize()
       ) {
        Box(
            modifier = Modifier.fillMaxWidth(),
        ){
            AccountBackground()
        }}
        Box(modifier = Modifier
            .padding(top = 180.dp)
            .clip(RoundedCornerShape(topStart = 20.dp, topEnd = 20.dp))
            .fillMaxSize()
            .background(AccountBackground)) {
            AccountScreenContent()
           }
}


@Composable
fun AccountScreenContent() {
    Column (modifier = Modifier
        .fillMaxHeight()
        .fillMaxWidth()
        .padding(horizontal = 16.dp, vertical = 23.dp)){

        Row(modifier = Modifier
            .padding(bottom = 8.dp)
            .height(56.dp)
            .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            TomStatsCard(
                backGroundColor = statsCards[0].backgroundColor,
                image = statsCards[0].imageRes,
                title = statsCards[0].title,
                description = statsCards[0].description,
                modifier = Modifier.weight(1f))

            TomStatsCard(
                backGroundColor = statsCards[1].backgroundColor,
                image = statsCards[1].imageRes,
                title = statsCards[1].title,
                description = statsCards[1].description,
                modifier = Modifier.weight(1f))
        }

        Row(modifier = Modifier
            .padding(bottom = 24.dp)
            .height(56.dp),

            horizontalArrangement = Arrangement.spacedBy(8.dp)) {
            TomStatsCard(
                backGroundColor = statsCards[2].backgroundColor,
                image = statsCards[2].imageRes,
                title = statsCards[2].title,
                description = statsCards[2].description,
                modifier = Modifier.weight(1f))

            TomStatsCard(
                backGroundColor = statsCards[3].backgroundColor,
                image = statsCards[3].imageRes,
                title = statsCards[3].title,
                description = statsCards[3].description,
                modifier = Modifier.weight(1f))
        }

        Text(
            text = "Tom settings",
            modifier = Modifier.height(30.dp),
            fontWeight = FontWeight(700),
            fontSize = 20.sp,
            color = PrimaryText,
            textAlign =TextAlign.Center)
        SpaceVertical8()

        TomAccountItem(image =tomSettings[0].icon, text =tomSettings[0].text )
        SpaceVertical12()
        TomAccountItem(image =tomSettings[1].icon, text =tomSettings[1].text )
        SpaceVertical12()
        TomAccountItem(image =tomSettings[2].icon, text =tomSettings[2].text )

        Spacer(modifier = Modifier.height(24.dp))

        Text(
            text = "His favorite foods",
            modifier = Modifier.height(30.dp),
            fontWeight = FontWeight(700),
            fontSize = 20.sp,
            color = PrimaryText,
            textAlign =TextAlign.Center)
        SpaceVertical8()

        TomAccountItem(image =favoriteFoods[0].icon, text =favoriteFoods[0].text )
        SpaceVertical12()
        TomAccountItem(image =favoriteFoods[1].icon, text =favoriteFoods[1].text )
        SpaceVertical12()
        TomAccountItem(image =favoriteFoods[2].icon, text =favoriteFoods[2].text )

        Text(
            text = stringResource(R.string.v_tombeta),
            modifier = Modifier.padding(top = 24.dp).fillMaxWidth(),
            fontSize = 12.sp,
            fontWeight = FontWeight(400),
            color = Gray60,
            textAlign = TextAlign.Center)
    }
}

@Composable
fun AccountBackground() {
    Image(
        painter = painterResource(id = R.drawable.background_container),
        contentDescription =null,
        modifier = Modifier
            .fillMaxWidth()
            .height(242.dp),
        contentScale = ContentScale.Crop)
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 16.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.tomimg),
            contentDescription =null,
            modifier = Modifier
                .padding(bottom = 4.dp)
                .size(64.dp)
                .clip(RoundedCornerShape(12.dp)))

        Text(
            text = "Tom",
            modifier = Modifier.height(23.dp),
            fontWeight = FontWeight(500),
            fontSize = 18.sp,
            lineHeight = (16 * 1.3).sp,
            textAlign = TextAlign.Center,
            color = White
        )

        Text(
            text = "specializes in failure!",
            modifier = Modifier
                .padding(bottom = 4.dp)
                .height(23.dp),
            fontWeight = FontWeight(400),
            fontSize = 12.sp,
            textAlign = TextAlign.Center,
            lineHeight = (12 * 1.8).sp,
            color = White80
        )

        Box(
            modifier = Modifier
                .background(
                    Color(0xFF4B87A2).copy(alpha = 0.4f),
                    shape = RoundedCornerShape(50)
                )
                .padding(horizontal = 12.dp, vertical = 6.dp)
        ) {
            Text(
                text = "Edit foolishness",
                fontSize = 10.sp,
                fontWeight = FontWeight(500),
                color = Color.White,
                textAlign = TextAlign.Center,
                lineHeight = (10 * 1.3).sp
            )
        }
        SpaceVertical8()
    }
}


@Preview(showBackground = true, showSystemUi = true,
    device = "spec:width=411dp,height=891dp"
)
@Composable
fun AccountScreenPreview(){
    AccountScreen()
}