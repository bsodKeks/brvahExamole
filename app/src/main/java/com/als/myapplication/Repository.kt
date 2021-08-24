package com.als.myapplication

import com.als.myapplication.data.NotificationDTO

class Repository {
    private var listItems: MutableList<NotificationDTO> = mutableListOf()

    init {
        listItems.add(
            NotificationDTO(
                date = "23.08.2021",
                text = "Самое новое уведомление! Спасибо что ты с нами, дальше будет интерено(но это не точно, а может быть точно, но я не уверен)",
                isRead = true
            )
        )
        listItems.add(
            NotificationDTO(
                date = "22.08.2021",
                text = "Подписывайся на мой канал в Я.Дзен. Там подборки про разработу под андроид, изготовление простых, но полезных устройств на ардуино и просто красивые технические решения https://zen.yandex.ru/id/611d56d8d8fe357cd6b1b9d6",
                isRead = false
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
                text = "Вот представь:  — У тебя есть 1000 рублей... Или, для круглого счета, пусть у тебя 1024",
                isRead = true
            )
        )
        listItems.add(
            NotificationDTO(
                date = "18.08.2021",
                text = "Мой первый пост на Дзене: https://zen.yandex.ru/media/id/611d56d8d8fe357cd6b1b9d6/radosti-ispolzovaniia-mobilnogo-kondicionera-i-dorabotki-dlia-nego-611df8fc6a368056921bacdf",
                isRead = false
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

    fun getAll() = listItems


}
