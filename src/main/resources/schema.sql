SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";

-- --------------------------------------------------------

--
-- Структура таблицы `actions`
--

DROP TABLE IF EXISTS `actions`;
CREATE TABLE `actions` (
    `id_actions` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Структура таблицы `document`
--

DROP TABLE IF EXISTS `document`;
CREATE TABLE `document` (
                            `id_doc` int(20) NOT NULL,
                            `description_doc` varchar(255) DEFAULT NULL,
                            `doc_name` varchar(255) DEFAULT NULL,
                            `status_doc` varchar(255) DEFAULT NULL,
                            `type_doc` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Структура таблицы `documenttype`
--

DROP TABLE IF EXISTS `documenttype`;
CREATE TABLE `documenttype` (
                                `id_doc` int(20) NOT NULL,
                                `description_doc` varchar(255) DEFAULT NULL,
                                `doc_name` varchar(255) DEFAULT NULL,
                                `status_doc` varchar(255) DEFAULT NULL,
                                `type_doc` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Структура таблицы `hibernate_sequence`
--

DROP TABLE IF EXISTS `hibernate_sequence`;
CREATE TABLE `hibernate_sequence` (
    `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Структура таблицы `list_docs`
--

DROP TABLE IF EXISTS `list_docs`;
CREATE TABLE `list_docs` (
                             `id_doc` int(20) NOT NULL,
                             `author_id` int(20) DEFAULT NULL,
                             `creation_doc` date DEFAULT NULL,
                             `registration_doc` date DEFAULT NULL,
                             `status` varchar(255) DEFAULT NULL,
                             `title_doc` varchar(255) DEFAULT NULL,
                             `views` int(11) NOT NULL,
                             `description_doc` varchar(255) DEFAULT NULL

) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Структура таблицы `loginusers`
--

DROP TABLE IF EXISTS `loginusers`;
CREATE TABLE `loginusers` (
                              `id_user` int(20) NOT NULL,
                              `login` varchar(255) DEFAULT NULL,
                              `password` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Структура таблицы `tasks`
--

DROP TABLE IF EXISTS `tasks`;
CREATE TABLE `tasks` (
    `id_task` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Структура таблицы `users`
--

DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
                         `id_user` int(20) NOT NULL,
                         `active_acc` int(1) DEFAULT NULL,
                         `fsm_sub` varchar(255) DEFAULT NULL,
                         `phone_sub` varchar(255) DEFAULT NULL,
                         `place_job` varchar(255) DEFAULT NULL,
                         `position` varchar(255) DEFAULT NULL,
                         `post_address` varchar(255) DEFAULT NULL,
                         `role_sub` varchar(255) DEFAULT NULL,
                         `subdivision` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Структура таблицы `users_role`
--

DROP TABLE IF EXISTS `users_role`;
CREATE TABLE `users_role` (
                              `id_role` int(20) NOT NULL,
                              `lvl_role` int(11) NOT NULL,
                              `name_role` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Индексы сохранённых таблиц
--

--
-- Индексы таблицы `actions`
--
ALTER TABLE `actions`
    ADD PRIMARY KEY (`id_actions`);

--
-- Индексы таблицы `document`
--
ALTER TABLE `document`
    ADD PRIMARY KEY (`id_doc`);

--
-- Индексы таблицы `documenttype`
--
ALTER TABLE `documenttype`
    ADD PRIMARY KEY (`id_doc`);

--
-- Индексы таблицы `list_docs`
--
ALTER TABLE `list_docs`
    ADD PRIMARY KEY (`id_doc`);

--
-- Индексы таблицы `loginusers`
--
ALTER TABLE `loginusers`
    ADD PRIMARY KEY (`id_user`);

--
-- Индексы таблицы `tasks`
--
ALTER TABLE `tasks`
    ADD PRIMARY KEY (`id_task`);

--
-- Индексы таблицы `users`
--
ALTER TABLE `users`
    ADD PRIMARY KEY (`id_user`);

--
-- Индексы таблицы `users_role`
--
ALTER TABLE `users_role`
    ADD PRIMARY KEY (`id_role`);

ALTER TABLE `list_docs`
    ADD CONSTRAINT FOREIGN KEY (author_id) REFERENCES users(id_user);
