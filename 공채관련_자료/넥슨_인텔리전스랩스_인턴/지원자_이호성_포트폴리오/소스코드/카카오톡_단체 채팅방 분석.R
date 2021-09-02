library(wordcloud2)
library(KoNLP)

setwd("C:/Rwd")

kakao <- readLines("KakaoTalkChats3.txt", encoding = "UTF-8")
kakao

kakao1 <- sapply(kakao, extractNoun, USE.NAMES = F)
kakao2 <- unlist(kakao1)

kakao2
kakao2 <- Filter(function(x) {nchar(x) >= 2}, kakao2)
kakao2 <- gsub("\\d+", "", kakao2)
kakao2 <- gsub("\\[", '', kakao2)
kakao2 <- gsub(']', '', kakao2)
kakao2 <- gsub('김대현', '', kakao2)
kakao2 <- gsub('상우', '', kakao2)
kakao2 <- gsub('준성', '', kakao2)
kakao2 <- gsub('김윤태', '', kakao2)
kakao2 <- gsub('hw', '', kakao2)
kakao2 <- gsub('kr', '', kakao2)
kakao2 <- gsub('https', '', kakao2)
kakao2 <- gsub('소정', '', kakao2)
kakao2 <- gsub('김정현', '', kakao2)
kakao2 <- gsub('윤영재', '', kakao2)
kakao2 <- gsub('오전', '', kakao2)
kakao2 <- gsub('오후', '', kakao2)
kakao2 <- gsub('\\.', '', kakao2)
View(kakao2)

write(unlist(kakao2), 'kakao2.txt')

kakao3<- read.table('kakao2.txt')
head(kakao3, 200)

#write(unlist(kakao3), 'kakao3.txt')
#kakao4 <- read.table("kakao3.txt")

wordcount <- table(kakao3)
wordcount <- head(sort(wordcount,decreasing=T), 200)
wordcount

wordcloud2(data=wordcount, size = 2, fontFamily = '나눔바른고딕')

#plot
fg <- table(kakao3)
graph_word <- head(sort(fg, decreasing = T), 10)
graph_word

y <- seq(100, 300, 50)
plot(graph_word, x =, col="red", type="o", axes=FALSE, ylim = c(100, 300))
axis(side=1, at=1:length(graph_word), labels=names(graph_word), las=2)
axis(side=2, at=y, labels=TRUE, las=1)

abline(h=seq(100,300,10),lty=3,lwd=0.2)
       
       
       