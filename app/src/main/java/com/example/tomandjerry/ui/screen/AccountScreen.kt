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
import com.example.tomandjerry.spacer.SpaceVertical12
import com.example.tomandjerry.spacer.SpaceVertical8
import com.example.tomandjerry.ui.components.StatsContainer
import com.example.tomandjerry.ui.components.TomAccountItem
import com.example.tomandjerry.ui.theme.AccountBackground
import com.example.tomandjerry.ui.theme.Gray60
import com.example.tomandjerry.ui.theme.PrimaryText
import com.example.tomandjerry.ui.theme.White
import com.example.tomandjerry.ui.theme.White80

@Composable
fun AccountScreen() {
    Column(modifier = Modifier
        .fillMaxSize()
       ) {
        Box(
            modifier = Modifier.fillMaxWidth(),
        ){
        Image(
            painter = painterResource(id = R.drawable.background_container),
            contentDescription =null,
            modifier = Modifier
                .fillMaxWidth()
                .height(242.dp),
            contentScale = ContentScale.Crop
        )

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
                    .clip(RoundedCornerShape(12.dp))

            )
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
        }}

        Box(modifier = Modifier
            .padding(top = 180.dp)
            .clip(RoundedCornerShape(topStart = 20.dp, topEnd = 20.dp))
            .fillMaxSize()
            .background(AccountBackground)) {

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
                    StatsContainer(backGroundColor = Color(0XFFD0E5F0), image = R.drawable.stat_icon_container_1
                        , title = "2M 12K", description = "No. of quarrels",  modifier = Modifier.weight(1f))

                    StatsContainer(backGroundColor = Color(0XFFDEEECD), image = R.drawable.stat_icon_container_2
                        , title = "+500 h", description = "Chase time",  modifier = Modifier.weight(1f))
                }

                Row(modifier = Modifier
                    .padding(bottom = 24.dp)
                    .height(56.dp),

                    horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                    StatsContainer(backGroundColor = Color(0XFFF2D9E7), image = R.drawable.stat_icon_container_3
                        , title = "2M 12K", description ="Hunting times",  modifier = Modifier.weight(1f))

                    StatsContainer(backGroundColor = Color(0XFFFAEDCF), image = R.drawable.stat_icon_container_4
                        , title = "3M 7K", description = "Heartbroken",  modifier = Modifier.weight(1f))
                }

                Text(
                    text = "Tom settings",
                    modifier = Modifier.height(30.dp),
                    fontWeight = FontWeight(700),
                    fontSize = 20.sp,
                    color = PrimaryText,
                    textAlign =TextAlign.Center
                )
                SpaceVertical8()

                TomAccountItem(image = R.drawable.settings_icon_container_1, text = "Change sleeping place")
                SpaceVertical12()
                TomAccountItem(image = R.drawable.settings_icon_container_2, text = "Meow settings")
                SpaceVertical12()
                TomAccountItem(image = R.drawable.settings_icon_container_3, text = "Password to open the fridge")

                Spacer(modifier = Modifier.height(24.dp))

                Text(
                    text = "His favorite foods",
                    modifier = Modifier.height(30.dp),
                    fontWeight = FontWeight(700),
                    fontSize = 20.sp,
                    color = PrimaryText,
                    textAlign =TextAlign.Center
                )
                SpaceVertical8()

                TomAccountItem(image = R.drawable.favorite_food_icon_container_1, text = "Mouses")
                SpaceVertical12()
                TomAccountItem(image = R.drawable.favorite_food_icon_container_2, text = "Last stolen meal")
                SpaceVertical12()
                TomAccountItem(image = R.drawable.favorite_food_icon_container_3, text = "Change sleep mood")

                Text(
                    text = stringResource(R.string.v_tombeta),
                      modifier = Modifier.padding(top = 24.dp).fillMaxWidth(),
                    fontSize = 12.sp,
                    fontWeight = FontWeight(400),
                    color = Gray60,
                    textAlign = TextAlign.Center)
            }
        }

}


@Preview(showBackground = true, showSystemUi = true,
    device = "spec:width=411dp,height=891dp"
)
@Composable
fun AccountScreenPreview(){
    AccountScreen()
}