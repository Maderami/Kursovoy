--
-- Дамп данных таблицы `hibernate_sequence`
--

INSERT INTO `hibernate_sequence` (`next_val`) VALUES
(9);

--
-- Дамп данных таблицы `users`
--

INSERT INTO `users` (`id_user`, `active_acc`, `fsm_sub`, `phone_sub`, `place_job`, `position`, `post_address`, `role_sub`, `subdivision`) VALUES
(1, 1, 'Ковальчук Артур Имельянович', '+79087917724', 'ОНП - Москва', 'Младший консультант', 'sdsoerty6584@gmail.com', '1', 'Отдел информационных технологий'),
(2, 1, 'Ковальчук2 Артур Имельянович', '+79087917724', 'ОНП - Москва', 'Младший консультант', 'sdsoerty6585@gmail.com', '1', 'Отдел информационных технологий');

INSERT INTO list_docs (id_doc, author_id, creation_doc, registration_doc, status, title_doc, views, description_doc)
VALUES (1, 1, '2021-12-15', '2021-12-15', 'Approve', 'New doc', 0, 'cvbvc')
,(2, 2, '2021-12-15', '2021-12-15', 'Reject', 'New doc1', 0, 'cvbvc')
,(3, 1, '2021-12-15', '2021-12-15', 'Approve', 'New gdfdg', 0, 'dggs');
