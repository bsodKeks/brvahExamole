package com.als.myapplication.data.repository

import com.als.myapplication.data.dto.MessageDTO
import com.als.myapplication.data.dto.NotificationDTO
import com.als.myapplication.data.dto.NotificationWithImageDTO
import com.als.myapplication.data.dto.NotificationWithSectionsDTO
import kotlin.random.Random

class Repository {
    private var listItems: MutableList<NotificationDTO> = mutableListOf()
    private var listImagedItems: MutableList<NotificationWithImageDTO> = mutableListOf()
    private var pageInfo = PageInfo()
    private val mayException = true // false чтобы не вызывать случайным образом ошибки подргузки 
    private val listMessages: MutableList<MessageDTO> = mutableListOf()
    private val listSections: MutableList<NotificationWithSectionsDTO> = mutableListOf()

    init {
        reset()
    }

    fun reset() {
        initNoImageData()
        initImagedData()
        initMessages()
        initSections()
        pageInfo = PageInfo()
    }

    private fun initSections() {
        listSections.add(
            NotificationWithSectionsDTO(
                titleText = "Интересное"
            )
        )
        listSections.add(
            NotificationWithSectionsDTO(
                date = "23.08.2021",
                text = "Самое новое уведомление! Спасибо что ты с нами, дальше будет интерено(но это не точно, а может быть точно, но я не уверен)",
                isRead = true,
                imageUrl = "https://sun2.ufanet.userapi.com/s/v1/ig2/MmH5LDVS7DNIyyeL2C-yo8UwDrXee1HwfgqEPB0x7e_DkNdz6619RQ-wJd-I1VlePnr1p6BqkY4GLnktiUpgLOQL.jpg?size=50x50&quality=96&crop=188,407,1144,1144&ava=1"
            )
        )
        listSections.add(
            NotificationWithSectionsDTO(
                date = "21.08.2021",
                text = "Просто какой то тескт, чтобы просто посмотреть. Вообще часто мы занимаемся полной ерундой, написание этого теста не исключение",
                isRead = false,
                imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTU9_876g2xpvgbasrtxnfckj_tC9it0jWoMw&usqp=CAU"
            )
        )
        listSections.add(
            NotificationWithSectionsDTO(
                date = "20.08.2021",
                text = "Вот представь:  — У тебя есть 1000 рублей... Или, для круглого счета, пусть у тебя 1024 гыгыгыгыгыгыгыгыгыгыгыгыг",
                isRead = true,
                imageUrl = "https://image.flaticon.com/icons/png/512/185/185034.png"
            )
        )

        listSections.add(
            NotificationWithSectionsDTO(
                titleText = "Веселое"
            )
        )

        listSections.add(
            NotificationWithSectionsDTO(
                date = "18.08.2021",
                text = "Программист ставит себе на тумбочку перед сном два стакана. Один с водой - на случай, если захочет ночью пить. А второй пустой - на случай, если не захочет.",
                isRead = false,
                imageUrl = "https://image.flaticon.com/icons/png/512/185/185034.png"
            )
        )
        listSections.add(
            NotificationWithSectionsDTO(
                date = "17.08.2021",
                text = "Если вы посмотрите на код, который вы писали более полугода назад, то, скорей всего, вам покажется, что автор – кто-то другой.",
                isRead = false,
                imageUrl = "https://previews.123rf.com/images/businessvector/businessvector1510/businessvector151000024/45788264-newspaper-icon.jpg"
            )
        )
        listSections.add(
            NotificationWithSectionsDTO(
                date = "15.08.2021",
                text = "На свете существует 10 типов людей: те, кто понимает двоичную систему счисления, и те, кто не понимает",
                isRead = true,
                imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTU9_876g2xpvgbasrtxnfckj_tC9it0jWoMw&usqp=CAU"
            )
        )
        listSections.add(
            NotificationWithSectionsDTO(
                date = "15.08.2021",
                text = "Отладка – это удаление из программного кода различных багов. Значит, программирование – это создание и добавление этих самых багов в код?",
                isRead = false,
                imageUrl = "https://image.flaticon.com/icons/png/512/185/185034.png"
            )
        )
        listSections.add(
            NotificationWithSectionsDTO(
                titleText = "Грустное"
            )
        )
        listSections.add(
            NotificationWithSectionsDTO(
                date = "15.08.2021",
                text = "Мне лень вспомнить шутки, поэтому дальше просто какой то текст",
                isRead = true,
                imageUrl = "https://previews.123rf.com/images/businessvector/businessvector1510/businessvector151000024/45788264-newspaper-icon.jpg"
            )
        )
        listSections.add(
            NotificationWithSectionsDTO(
                date = "10.08.2021",
                text = "тут тоже какой то текст, мне уже лень даже поднимать первую букву в верхний регистр",
                isRead = false,
                imageUrl = "https://previews.123rf.com/images/businessvector/businessvector1510/businessvector151000024/45788264-newspaper-icon.jpg"
            )
        )
        listSections.add(
            NotificationWithSectionsDTO(
                date = "08.08.2021",
                text = "осталось немного элементов, я еще держусь и я точно знаю что дойду до конца",
                isRead = false,
                imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTU9_876g2xpvgbasrtxnfckj_tC9it0jWoMw&usqp=CAU"
            )
        )
        listSections.add(
            NotificationWithSectionsDTO(
                date = "08.08.2021",
                text = "давайте споём, тулула тутутутулула в голове моей замкнуло лалалаааааааа",
                isRead = false,
                imageUrl = ""
            )
        )
        listSections.add(
            NotificationWithSectionsDTO(
                titleText = "Прочее"
            )
        )
        listSections.add(
            NotificationWithSectionsDTO(
                date = "08.08.2021",
                text = "на поле танки грохотали, солдаты шли в последний бой, а молодого командира несли с пробитой головой",
                isRead = false,
                imageUrl = "https://img.freepik.com/free-vector/note-music-logo-design_93835-645.jpg?size=338&ext=jpg"
            )
        )
        listSections.add(
            NotificationWithSectionsDTO(
                date = "07.08.2021",
                text = "под танк ударила болванка, прощай, гардейский экипаж! четыре трупа возле танка дополнят утренний пезаж",
                isRead = false,
                imageUrl = "https://img.freepik.com/free-vector/note-music-logo-design_93835-645.jpg?size=338&ext=jpg"
            )
        )
        listSections.add(
            NotificationWithSectionsDTO(
                date = "01.08.2021",
                text = "последнее уведомление! Ура ура ура, я это сделал. Наверно это было самое сложное в этом примере",
                isRead = false,
                imageUrl = "https://previews.123rf.com/images/businessvector/businessvector1510/businessvector151000024/45788264-newspaper-icon.jpg"
            )
        )
    }

    private fun initMessages() {
        listMessages.add(
            MessageDTO(
                text = "Продам гараж",
                price = "563000 Р",
                mayAgreement = true,
                image = "https://57.img.avito.st/image/1/8PZ_abayXB9JwJ4aEx6uoJvKXBnfyF4",
                type = MessageDTO.typeNotPremium
            )
        )

        listMessages.add(
            MessageDTO(
                text = "Продам айфон",
                price = "45000 Р",
                mayAgreement = true,
                image = "https://www.ixbt.com/img/n1/news/2020/9/4/apple_announce-iphone12pro_10132020_large.jpg",
                type = MessageDTO.typeNotPremium

            )
        )

        listMessages.add(
            MessageDTO(
                text = "Продам жигу",
                price = "15000 Р",
                mayAgreement = false,
                image = "https://i.ytimg.com/vi/BxBK_omjJdM/maxresdefault.jpg",
                type = MessageDTO.typeNotPremium
            )
        )

        listMessages.add(
            MessageDTO(
                text = "Продам бэху",
                price = "563000 Р",
                mayAgreement = true,
                image = "https://www.vladtime.ru/uploads/posts/2018-12/1545286329_1.jpeg",
                type = MessageDTO.typePremium
            )
        )

        listMessages.add(
            MessageDTO(
                text = "Продам девятку",
                price = "10000 Р",
                mayAgreement = true,
                image = "https://cdnimg.rg.ru/img/content/186/79/17/01_d_850.jpg",
                type = MessageDTO.typeNotPremium
            )
        )

        listMessages.add(
            MessageDTO(
                text = "Продам ноутбук",
                price = "150000 Р",
                mayAgreement = true,
                image = "https://upload.wikimedia.org/wikipedia/commons/thumb/3/37/Schenker_VIA14_Laptop_asv2021-01.jpg/300px-Schenker_VIA14_Laptop_asv2021-01.jpg",
                type = MessageDTO.typePremium
            )
        )

        listMessages.add(
            MessageDTO(
                text = "Продам мясорубку",
                price = "100 Р",
                mayAgreement = false,
                image = "https://qpicture.ru/images/2020/03/16/2zpz.jpg",
                type = MessageDTO.typeNotPremium
            )
        )

        listMessages.add(
            MessageDTO(
                text = "Продам квартиру",
                price = "5000000 Р",
                mayAgreement = true,
                image = "https://cdn-p.cian.site/images/43/588/111/1118853463-4.jpg",
                type = MessageDTO.typeNotPremium
            )
        )

        listMessages.add(
            MessageDTO(
                text = "Продам дом",
                price = "10000000 Р",
                mayAgreement = true,
                image = "https://cdn-p.cian.site/images/73/906/111/1116093730-4.jpg",
                type = MessageDTO.typeNotPremium
            )
        )

        listMessages.add(
            MessageDTO(
                text = "Продам кондиционер",
                price = "10000 Р",
                mayAgreement = false,
                image = "https://aif-s3.aif.ru/images/003/636/fd5289dfe829fe49c7fbc3b5cc4fdfd5.jpg",
                type = MessageDTO.typeNotPremium
            )
        )
        listMessages.add(
            MessageDTO(
                text = "Продам гараж",
                price = "563000 Р",
                mayAgreement = true,
                image = "https://57.img.avito.st/image/1/8PZ_abayXB9JwJ4aEx6uoJvKXBnfyF4",
                type = MessageDTO.typeNotPremium
            )
        )

        listMessages.add(
            MessageDTO(
                text = "Продам айфон",
                price = "45000 Р",
                mayAgreement = true,
                image = "https://www.ixbt.com/img/n1/news/2020/9/4/apple_announce-iphone12pro_10132020_large.jpg",
                type = MessageDTO.typeNotPremium

            )
        )

        listMessages.add(
            MessageDTO(
                text = "Продам жигу",
                price = "15000 Р",
                mayAgreement = false,
                image = "https://i.ytimg.com/vi/BxBK_omjJdM/maxresdefault.jpg",
                type = MessageDTO.typeNotPremium
            )
        )

        listMessages.add(
            MessageDTO(
                text = "Продам бэху",
                price = "563000 Р",
                mayAgreement = true,
                image = "https://www.vladtime.ru/uploads/posts/2018-12/1545286329_1.jpeg",
                type = MessageDTO.typePremium
            )
        )

        listMessages.add(
            MessageDTO(
                text = "Продам девятку",
                price = "10000 Р",
                mayAgreement = true,
                image = "https://cdnimg.rg.ru/img/content/186/79/17/01_d_850.jpg",
                type = MessageDTO.typeNotPremium
            )
        )

        listMessages.add(
            MessageDTO(
                text = "Продам ноутбук",
                price = "150000 Р",
                mayAgreement = true,
                image = "https://upload.wikimedia.org/wikipedia/commons/thumb/3/37/Schenker_VIA14_Laptop_asv2021-01.jpg/300px-Schenker_VIA14_Laptop_asv2021-01.jpg",
                type = MessageDTO.typePremium
            )
        )

        listMessages.add(
            MessageDTO(
                text = "Продам мясорубку",
                price = "100 Р",
                mayAgreement = false,
                image = "https://qpicture.ru/images/2020/03/16/2zpz.jpg",
                type = MessageDTO.typeNotPremium
            )
        )

        listMessages.add(
            MessageDTO(
                text = "Продам квартиру",
                price = "5000000 Р",
                mayAgreement = true,
                image = "https://cdn-p.cian.site/images/43/588/111/1118853463-4.jpg",
                type = MessageDTO.typeNotPremium
            )
        )

        listMessages.add(
            MessageDTO(
                text = "Продам дом",
                price = "10000000 Р",
                mayAgreement = true,
                image = "https://cdn-p.cian.site/images/73/906/111/1116093730-4.jpg",
                type = MessageDTO.typeNotPremium
            )
        )

        listMessages.add(
            MessageDTO(
                text = "Продам кондиционер",
                price = "10000 Р",
                mayAgreement = false,
                image = "https://aif-s3.aif.ru/images/003/636/fd5289dfe829fe49c7fbc3b5cc4fdfd5.jpg",
                type = MessageDTO.typeNotPremium
            )
        )
        listMessages.add(
            MessageDTO(
                text = "Продам гараж",
                price = "563000 Р",
                mayAgreement = true,
                image = "https://57.img.avito.st/image/1/8PZ_abayXB9JwJ4aEx6uoJvKXBnfyF4",
                type = MessageDTO.typeNotPremium
            )
        )

        listMessages.add(
            MessageDTO(
                text = "Продам айфон",
                price = "45000 Р",
                mayAgreement = true,
                image = "https://www.ixbt.com/img/n1/news/2020/9/4/apple_announce-iphone12pro_10132020_large.jpg",
                type = MessageDTO.typeNotPremium

            )
        )

        listMessages.add(
            MessageDTO(
                text = "Продам жигу",
                price = "15000 Р",
                mayAgreement = false,
                image = "https://i.ytimg.com/vi/BxBK_omjJdM/maxresdefault.jpg",
                type = MessageDTO.typeNotPremium
            )
        )

        listMessages.add(
            MessageDTO(
                text = "Продам бэху",
                price = "563000 Р",
                mayAgreement = true,
                image = "https://www.vladtime.ru/uploads/posts/2018-12/1545286329_1.jpeg",
                type = MessageDTO.typePremium
            )
        )

        listMessages.add(
            MessageDTO(
                text = "Продам девятку",
                price = "10000 Р",
                mayAgreement = true,
                image = "https://cdnimg.rg.ru/img/content/186/79/17/01_d_850.jpg",
                type = MessageDTO.typeNotPremium
            )
        )

        listMessages.add(
            MessageDTO(
                text = "Продам ноутбук",
                price = "150000 Р",
                mayAgreement = true,
                image = "https://upload.wikimedia.org/wikipedia/commons/thumb/3/37/Schenker_VIA14_Laptop_asv2021-01.jpg/300px-Schenker_VIA14_Laptop_asv2021-01.jpg",
                type = MessageDTO.typePremium
            )
        )

        listMessages.add(
            MessageDTO(
                text = "Продам мясорубку",
                price = "100 Р",
                mayAgreement = false,
                image = "https://qpicture.ru/images/2020/03/16/2zpz.jpg",
                type = MessageDTO.typeNotPremium
            )
        )

        listMessages.add(
            MessageDTO(
                text = "Продам квартиру",
                price = "5000000 Р",
                mayAgreement = true,
                image = "https://cdn-p.cian.site/images/43/588/111/1118853463-4.jpg",
                type = MessageDTO.typeNotPremium
            )
        )

        listMessages.add(
            MessageDTO(
                text = "Продам дом",
                price = "10000000 Р",
                mayAgreement = true,
                image = "https://cdn-p.cian.site/images/73/906/111/1116093730-4.jpg",
                type = MessageDTO.typeNotPremium
            )
        )

        listMessages.add(
            MessageDTO(
                text = "Продам кондиционер",
                price = "10000 Р",
                mayAgreement = false,
                image = "https://aif-s3.aif.ru/images/003/636/fd5289dfe829fe49c7fbc3b5cc4fdfd5.jpg",
                type = MessageDTO.typeNotPremium
            )
        )
    }

    private fun initImagedData() {
        listImagedItems.add(
            NotificationWithImageDTO(
                date = "23.08.2021",
                text = "Самое новое уведомление! Спасибо что ты с нами, дальше будет интерено(но это не точно, а может быть точно, но я не уверен)",
                isRead = true,
                imageUrl = "https://sun2.ufanet.userapi.com/s/v1/ig2/MmH5LDVS7DNIyyeL2C-yo8UwDrXee1HwfgqEPB0x7e_DkNdz6619RQ-wJd-I1VlePnr1p6BqkY4GLnktiUpgLOQL.jpg?size=50x50&quality=96&crop=188,407,1144,1144&ava=1"
            )
        )
        listImagedItems.add(
            NotificationWithImageDTO(
                date = "21.08.2021",
                text = "Просто какой то тескт, чтобы просто посмотреть. Вообще часто мы занимаемся полной ерундой, написание этого теста не исключение",
                isRead = false,
                imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTU9_876g2xpvgbasrtxnfckj_tC9it0jWoMw&usqp=CAU"
            )
        )
        listImagedItems.add(
            NotificationWithImageDTO(
                date = "20.08.2021",
                text = "Вот представь:  — У тебя есть 1000 рублей... Или, для круглого счета, пусть у тебя 1024 гыгыгыгыгыгыгыгыгыгыгыгыг",
                isRead = true,
                imageUrl = "https://image.flaticon.com/icons/png/512/185/185034.png"
            )
        )

        listImagedItems.add(
            NotificationWithImageDTO(
                date = "18.08.2021",
                text = "Программист ставит себе на тумбочку перед сном два стакана. Один с водой - на случай, если захочет ночью пить. А второй пустой - на случай, если не захочет.",
                isRead = false,
                imageUrl = "https://image.flaticon.com/icons/png/512/185/185034.png"
            )
        )
        listImagedItems.add(
            NotificationWithImageDTO(
                date = "17.08.2021",
                text = "Если вы посмотрите на код, который вы писали более полугода назад, то, скорей всего, вам покажется, что автор – кто-то другой.",
                isRead = false,
                imageUrl = "https://previews.123rf.com/images/businessvector/businessvector1510/businessvector151000024/45788264-newspaper-icon.jpg"
            )
        )
        listImagedItems.add(
            NotificationWithImageDTO(
                date = "15.08.2021",
                text = "На свете существует 10 типов людей: те, кто понимает двоичную систему счисления, и те, кто не понимает",
                isRead = true,
                imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTU9_876g2xpvgbasrtxnfckj_tC9it0jWoMw&usqp=CAU"
            )
        )
        listImagedItems.add(
            NotificationWithImageDTO(
                date = "15.08.2021",
                text = "Отладка – это удаление из программного кода различных багов. Значит, программирование – это создание и добавление этих самых багов в код?",
                isRead = false,
                imageUrl = "https://image.flaticon.com/icons/png/512/185/185034.png"
            )
        )
        listImagedItems.add(
            NotificationWithImageDTO(
                date = "15.08.2021",
                text = "Мне лень вспомнить шутки, поэтому дальше просто какой то текст",
                isRead = true,
                imageUrl = "https://previews.123rf.com/images/businessvector/businessvector1510/businessvector151000024/45788264-newspaper-icon.jpg"
            )
        )
        listImagedItems.add(
            NotificationWithImageDTO(
                date = "10.08.2021",
                text = "тут тоже какой то текст, мне уже лень даже поднимать первую букву в верхний регистр",
                isRead = false,
                imageUrl = "https://previews.123rf.com/images/businessvector/businessvector1510/businessvector151000024/45788264-newspaper-icon.jpg"
            )
        )
        listImagedItems.add(
            NotificationWithImageDTO(
                date = "08.08.2021",
                text = "осталось немного элементов, я еще держусь и я точно знаю что дойду до конца",
                isRead = false,
                imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTU9_876g2xpvgbasrtxnfckj_tC9it0jWoMw&usqp=CAU"
            )
        )
        listImagedItems.add(
            NotificationWithImageDTO(
                date = "08.08.2021",
                text = "давайте споём, тулула тутутутулула в голове моей замкнуло лалалаааааааа",
                isRead = false,
                imageUrl = ""
            )
        )
        listImagedItems.add(
            NotificationWithImageDTO(
                date = "08.08.2021",
                text = "на поле танки грохотали, солдаты шли в последний бой, а молодого командира несли с пробитой головой",
                isRead = false,
                imageUrl = "https://img.freepik.com/free-vector/note-music-logo-design_93835-645.jpg?size=338&ext=jpg"
            )
        )
        listImagedItems.add(
            NotificationWithImageDTO(
                date = "07.08.2021",
                text = "под танк ударила болванка, прощай, гардейский экипаж! четыре трупа возле танка дополнят утренний пезаж",
                isRead = false,
                imageUrl = "https://img.freepik.com/free-vector/note-music-logo-design_93835-645.jpg?size=338&ext=jpg"
            )
        )
        listImagedItems.add(
            NotificationWithImageDTO(
                date = "01.08.2021",
                text = "последнее уведомление! Ура ура ура, я это сделал. Наверно это было самое сложное в этом примере",
                isRead = false,
                imageUrl = "https://previews.123rf.com/images/businessvector/businessvector1510/businessvector151000024/45788264-newspaper-icon.jpg"
            )
        )
    }

    private fun initNoImageData() {
        listItems.add(
            NotificationDTO(
                date = "23.08.2021",
                text = "Самое новое уведомление! Спасибо что ты с нами, дальше будет интерено(но это не точно, а может быть точно, но я не уверен)",
                isRead = true
            )
        )
        listItems.add(
            NotificationDTO(
                date = "21.08.2021",
                text = "Просто какой то тескт, чтобы просто посмотреть. Вообще часто мы занимаемся полной ерундой, написание этого теста не исключение",
                isRead = false
            )
        )
        listItems.add(
            NotificationDTO(
                date = "20.08.2021",
                text = "Вот представь:  — У тебя есть 1000 рублей... Или, для круглого счета, пусть у тебя 1024 гыгыгыгыгыгыгыгыгыгыгыгыг",
                isRead = true
            )
        )

        listItems.add(
            NotificationDTO(
                date = "18.08.2021",
                text = "Программист ставит себе на тумбочку перед сном два стакана. Один с водой - на случай, если захочет ночью пить. А второй пустой - на случай, если не захочет.",
                isRead = false
            )
        )
        listItems.add(
            NotificationDTO(
                date = "17.08.2021",
                text = "Если вы посмотрите на код, который вы писали более полугода назад, то, скорей всего, вам покажется, что автор – кто-то другой.",
                isRead = false
            )
        )
        listItems.add(
            NotificationDTO(
                date = "15.08.2021",
                text = "На свете существует 10 типов людей: те, кто понимает двоичную систему счисления, и те, кто не понимает",
                isRead = true
            )
        )
        listItems.add(
            NotificationDTO(
                date = "15.08.2021",
                text = "Отладка – это удаление из программного кода различных багов. Значит, программирование – это создание и добавление этих самых багов в код?",
                isRead = false
            )
        )
        listItems.add(
            NotificationDTO(
                date = "15.08.2021",
                text = "Мне лень вспомнить шутки, поэтому дальше просто какой то текст",
                isRead = true
            )
        )
        listItems.add(
            NotificationDTO(
                date = "10.08.2021",
                text = "тут тоже какой то текст, мне уже лень даже поднимать первую букву в верхний регистр",
                isRead = false
            )
        )
        listItems.add(
            NotificationDTO(
                date = "08.08.2021",
                text = "осталось немного элементов, я еще держусь и я точно знаю что дойду до конца",
                isRead = false
            )
        )
        listItems.add(
            NotificationDTO(
                date = "08.08.2021",
                text = "давайте споём, тулула тутутутулула в голове моей замкнуло лалалаааааааа",
                isRead = false
            )
        )
        listItems.add(
            NotificationDTO(
                date = "08.08.2021",
                text = "на поле танки грохотали, солдаты шли в последний бой, а молодого командира несли с пробитой головой",
                isRead = false
            )
        )
        listItems.add(
            NotificationDTO(
                date = "07.08.2021",
                text = "под танк ударила болванка, прощай, гардейский экипаж! четыре трупа возле танка дополнят утренний пезаж",
                isRead = false
            )
        )
        listItems.add(
            NotificationDTO(
                date = "01.08.2021",
                text = "последнее уведомление! Ура ура ура, я это сделал. Наверно это было самое сложное в этом примере",
                isRead = false
            )
        )
    }

    fun getAllNotImaged() = listItems

    fun getAllImagedData() = listImagedItems

    fun getMessages() = listMessages

    fun getSections() = listSections

    fun firstPage(): MutableList<NotificationWithImageDTO> {
        pageInfo.nextPage()
        var firstIndex = pageInfo.page * pageInfo.COUNT_ON_PAGE
        var endIndex = firstIndex + pageInfo.COUNT_ON_PAGE - 1

        if (firstIndex > listImagedItems.size - 1 || endIndex > listImagedItems.size - 1) {
            pageInfo.isFinish = true
            if (firstIndex > listImagedItems.size - 1) firstIndex = listImagedItems.size - 1
            if (endIndex > listImagedItems.size - 1) endIndex = listImagedItems.size - 1
        }

        return listImagedItems.slice(firstIndex..endIndex).toMutableList()
    }

    fun nextPage(): MutableList<NotificationWithImageDTO> {
        if (mayException) {
            if (Random.nextBoolean())
                throw AnyException()
        }
        if (pageInfo.isFinish) return mutableListOf()
        pageInfo.nextPage()
        var firstIndex = pageInfo.page * pageInfo.COUNT_ON_PAGE
        var endIndex = firstIndex + pageInfo.COUNT_ON_PAGE - 1

        if (firstIndex > listImagedItems.size - 1 || endIndex > listImagedItems.size - 1) {
            pageInfo.isFinish = true
            if (firstIndex > listImagedItems.size - 1) firstIndex = listImagedItems.size - 1
            if (endIndex > listImagedItems.size - 1) endIndex = listImagedItems.size - 1
        }

        return listImagedItems.slice(firstIndex..endIndex).toMutableList()
    }

    fun deleteImagedItem(position: Int): MutableList<NotificationWithImageDTO> {
        listImagedItems.removeAt(position)
        var endIndex = pageInfo.COUNT_ON_PAGE + pageInfo.COUNT_ON_PAGE - 1
        if (endIndex > listImagedItems.size - 1) endIndex = listImagedItems.size - 1
        return listImagedItems.slice(0..endIndex).toMutableList()
    }

    fun isEnd() = pageInfo.isFinish

    /** class for save page info*/
    inner class PageInfo(var page: Int = -1) {
        val COUNT_ON_PAGE = 5
        var isFinish = false
        fun nextPage() {
            page += 1
        }
    }
}
