package com.example.tomandjerry.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.tomandjerry.R
import com.example.tomandjerry.model.TomModel
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.compose.material3.Card
import androidx.compose.ui.Alignment
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import com.example.tomandjerry.data.tomList
import com.example.tomandjerry.spacer.SpaceHorizontal8
import com.example.tomandjerry.spacer.SpaceVertical16
import com.example.tomandjerry.spacer.SpaceVertical8
import com.example.tomandjerry.ui.theme.DarkBlue
import com.example.tomandjerry.ui.theme.GrayMetallic
import com.example.tomandjerry.ui.theme.LightSkyBlue
import com.example.tomandjerry.ui.theme.PrimaryText


@Composable
fun TomItemsGrid() {
    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        verticalArrangement = Arrangement.spacedBy(28.dp),
        horizontalArrangement = Arrangement.spacedBy(12.dp),
        modifier = Modifier
            .padding(top = 18.dp)
            .fillMaxHeight()

    ) {
        items(tomList) { tom ->
            TomCard(tom)
        }
    }
}

@Composable
fun TomCard(tom: TomModel) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(235.dp)
    ) {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(219.dp)
                .align(Alignment.BottomCenter),
            shape = RoundedCornerShape(16.dp),
            elevation = CardDefaults.cardElevation(1.dp),
            colors = CardDefaults.cardColors(containerColor = Color.White)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 84.dp, bottom = 8.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = tom.name,
                    fontSize = 18.sp,
                    fontWeight = FontWeight(600),
                    color = PrimaryText,
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .width(144.dp)
                        .height(27.dp)
                )

                SpaceVertical8()
                Text(
                    text = tom.description,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Normal,
                    color = GrayMetallic,
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .width(144.dp)
                        .height(36.dp)
                )

                SpaceVertical16()

                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Card(
                        shape = RoundedCornerShape(8.dp),
                        colors = CardDefaults.cardColors(containerColor = LightSkyBlue),
                        modifier = Modifier
                            .width(106.dp)
                            .height(30.dp)
                    ) {
                        Row(
                            modifier = Modifier.fillMaxSize(),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.money_bag_01),
                                contentDescription = stringResource(R.string.money_bag),
                                modifier = Modifier
                                    .padding(start = 8.dp)
                                    .size(width = 13.dp, height = 14.33.dp)
                            )

                            Text(
                                text = "${tom.cheeseCount} cheeses",
                                fontSize = 12.sp,
                                fontWeight = FontWeight(500),
                                color = DarkBlue,
                                modifier = Modifier
                                    .padding(start = 4.dp)
                                    .fillMaxHeight()
                                    .wrapContentHeight(align = Alignment.CenterVertically)
                            )
                        }
                    }

                    SpaceHorizontal8()

                    Image(
                        painter = painterResource(id = R.drawable.add_to_cart),
                        contentDescription = stringResource(R.string.add_to_cart),
                        modifier = Modifier.size(30.dp)
                    )
                }
            }
        }

        Image(
            painter = painterResource(id = tom.image),
            contentDescription = tom.name,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .align(Alignment.TopCenter)
                .offset(y = (-12).dp)
                .size(width = 84.dp, height = 100.dp)
        )
    }
}
