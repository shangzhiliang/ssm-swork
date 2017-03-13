

-- 大区编码初始化
INSERT INTO `pdms_dictionary` ( `parent_code`, `code`, `value`, `seq_no`, `is_deleted`, `c_t`, `u_t`, `create_user`, `update_user`) 
VALUES ('0', '1018', '大区', 0, 0, 1480334633, 1480334677, 12, 121);

INSERT INTO `pdms_dictionary` (`parent_code`, `code`, `value`, `seq_no`, `c_t`, `u_t`, `create_user`, `update_user`) VALUES
('1018', '851', 'B', 1, 1483701173, 1483701173, 0, 0),
('1018', '852', 'C', 2, 1483701173, 1483701173, 0, 0),
('1018', '853', 'D', 3, 1483701173, 1483701173, 0, 0),
('1018', '854', 'F', 4, 1483701173, 1483701173, 0, 0),
('1018', '856', 'H', 6, 1483701173, 1483701173, 0, 0),
('1018', '855', 'G', 5, 1483701173, 1483701173, 0, 0),
('1018', '857', 'J', 7, 1483701173, 1483701173, 0, 0),
('1018', '858', 'K', 8, 1483701173, 1483701173, 0, 0),
('1018', '859', 'P', 9, 1483701173, 1483701173, 0, 0),
('1018', '860', 'Q', 10, 1483701173, 1483701173, 0, 0),
('1018', '861', 'R', 11, 1483701173, 1483701173, 0, 0),
('1018', '862', 'S', 12, 1483701173, 1483701173, 0, 0),
('1018', '863', 'X', 13, 1483701173, 1483701173, 0, 0),
('1018', '864', 'Y', 14, 1483701173, 1483701173, 0, 0),
('1018', '865', 'T', 15, 1483701173, 1483701173, 0, 0);

-- 初始化仓库发货区
INSERT INTO `pdms_sorting_center_area` VALUES (1, '', 'A', 'FA', '854', '蔬菜发货区', 7, 1, 1, 1, 1, 0, 1482925931, 0, 1482925931, '0', '开仓初始化', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (2, '', 'B', 'FB', '854', '标品发货区', 7, 1, 1, 1, 1, 0, 1482925931, 0, 1482925931, '0', '开仓初始化', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (3, '', 'C', 'FC', '854', '肉禽发货区', 7, 1, 1, 1, 1, 0, 1482925931, 0, 1482925931, '0', '开仓初始化', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (4, '', 'D', 'FD', '854', '蔬菜投线区', 7, 1, 1, 1, 1, 0, 1482925931, 0, 1482925931, '0', '开仓初始化', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (5, '', 'H', 'FH', '854', '站点发货区', 7, 1, 1, 1, 1, 0, 1482925931, 0, 1482925931, '0', '开仓初始化', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (6, '', 'A', 'FA', '854', '蔬菜发货区', 7, 1, 1, 2, 1, 0, 1488976834, 0, 1488976834, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (7, '', 'B', 'FB', '854', '标品发货区', 7, 1, 1, 2, 1, 0, 1488976834, 0, 1488976834, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (8, '', 'C', 'FC', '854', '肉禽发货区', 7, 1, 1, 2, 1, 0, 1488976834, 0, 1488976834, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (9, '', 'D', 'FD', '854', '蔬菜投线区', 7, 1, 1, 2, 1, 0, 1488976834, 0, 1488976834, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (10, '', 'H', 'FH', '854', '站点发货区', 7, 1, 1, 2, 1, 0, 1488976834, 0, 1488976834, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (11, '', 'A', 'FA', '854', '蔬菜发货区', 7, 1, 1, 3, 1, 0, 1488976884, 0, 1488976884, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (12, '', 'B', 'FB', '854', '标品发货区', 7, 1, 1, 3, 1, 0, 1488976884, 0, 1488976884, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (13, '', 'C', 'FC', '854', '肉禽发货区', 7, 1, 1, 3, 1, 0, 1488976884, 0, 1488976884, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (14, '', 'D', 'FD', '854', '蔬菜投线区', 7, 1, 1, 3, 1, 0, 1488976884, 0, 1488976884, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (15, '', 'H', 'FH', '854', '站点发货区', 7, 1, 1, 3, 1, 0, 1488976884, 0, 1488976884, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (16, '', 'A', 'FA', '854', '蔬菜发货区', 7, 1, 1, 4, 1, 0, 1488976888, 0, 1488976888, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (17, '', 'B', 'FB', '854', '标品发货区', 7, 1, 1, 4, 1, 0, 1488976888, 0, 1488976888, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (18, '', 'C', 'FC', '854', '肉禽发货区', 7, 1, 1, 4, 1, 0, 1488976888, 0, 1488976888, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (19, '', 'D', 'FD', '854', '蔬菜投线区', 7, 1, 1, 4, 1, 0, 1488976888, 0, 1488976888, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (20, '', 'H', 'FH', '854', '站点发货区', 7, 1, 1, 4, 1, 0, 1488976888, 0, 1488976888, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (21, '', 'A', 'FA', '854', '蔬菜发货区', 7, 1, 1, 5, 1, 0, 1488976898, 0, 1488976898, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (22, '', 'B', 'FB', '854', '标品发货区', 7, 1, 1, 5, 1, 0, 1488976898, 0, 1488976898, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (23, '', 'C', 'FC', '854', '肉禽发货区', 7, 1, 1, 5, 1, 0, 1488976898, 0, 1488976898, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (24, '', 'D', 'FD', '854', '蔬菜投线区', 7, 1, 1, 5, 1, 0, 1488976898, 0, 1488976898, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (25, '', 'H', 'FH', '854', '站点发货区', 7, 1, 1, 5, 1, 0, 1488976898, 0, 1488976898, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (26, '', 'A', 'FA', '854', '蔬菜发货区', 7, 1, 1, 6, 1, 0, 1488976901, 0, 1488976901, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (27, '', 'B', 'FB', '854', '标品发货区', 7, 1, 1, 6, 1, 0, 1488976901, 0, 1488976901, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (28, '', 'C', 'FC', '854', '肉禽发货区', 7, 1, 1, 6, 1, 0, 1488976901, 0, 1488976901, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (29, '', 'D', 'FD', '854', '蔬菜投线区', 7, 1, 1, 6, 1, 0, 1488976901, 0, 1488976901, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (30, '', 'H', 'FH', '854', '站点发货区', 7, 1, 1, 6, 1, 0, 1488976901, 0, 1488976901, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (31, '', 'A', 'FA', '854', '蔬菜发货区', 7, 1, 1, 7, 1, 0, 1488976904, 0, 1488976904, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (32, '', 'B', 'FB', '854', '标品发货区', 7, 1, 1, 7, 1, 0, 1488976904, 0, 1488976904, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (33, '', 'C', 'FC', '854', '肉禽发货区', 7, 1, 1, 7, 1, 0, 1488976904, 0, 1488976904, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (34, '', 'D', 'FD', '854', '蔬菜投线区', 7, 1, 1, 7, 1, 0, 1488976904, 0, 1488976904, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (35, '', 'H', 'FH', '854', '站点发货区', 7, 1, 1, 7, 1, 0, 1488976904, 0, 1488976904, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (36, '', 'A', 'FA', '854', '蔬菜发货区', 7, 1, 1, 8, 1, 0, 1488976906, 0, 1488976906, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (37, '', 'B', 'FB', '854', '标品发货区', 7, 1, 1, 8, 1, 0, 1488976906, 0, 1488976906, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (38, '', 'C', 'FC', '854', '肉禽发货区', 7, 1, 1, 8, 1, 0, 1488976906, 0, 1488976906, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (39, '', 'D', 'FD', '854', '蔬菜投线区', 7, 1, 1, 8, 1, 0, 1488976906, 0, 1488976906, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (40, '', 'H', 'FH', '854', '站点发货区', 7, 1, 1, 8, 1, 0, 1488976906, 0, 1488976906, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (41, '', 'A', 'FA', '854', '蔬菜发货区', 7, 1, 1, 9, 1, 0, 1488976909, 0, 1488976909, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (42, '', 'B', 'FB', '854', '标品发货区', 7, 1, 1, 9, 1, 0, 1488976909, 0, 1488976909, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (43, '', 'C', 'FC', '854', '肉禽发货区', 7, 1, 1, 9, 1, 0, 1488976909, 0, 1488976909, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (44, '', 'D', 'FD', '854', '蔬菜投线区', 7, 1, 1, 9, 1, 0, 1488976909, 0, 1488976909, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (45, '', 'H', 'FH', '854', '站点发货区', 7, 1, 1, 9, 1, 0, 1488976909, 0, 1488976909, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (46, '', 'A', 'FA', '854', '蔬菜发货区', 7, 1, 1, 10, 1, 0, 1488977077, 0, 1488977077, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (47, '', 'B', 'FB', '854', '标品发货区', 7, 1, 1, 10, 1, 0, 1488977077, 0, 1488977077, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (48, '', 'C', 'FC', '854', '肉禽发货区', 7, 1, 1, 10, 1, 0, 1488977077, 0, 1488977077, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (49, '', 'D', 'FD', '854', '蔬菜投线区', 7, 1, 1, 10, 1, 0, 1488977077, 0, 1488977077, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (50, '', 'H', 'FH', '854', '站点发货区', 7, 1, 1, 10, 1, 0, 1488977077, 0, 1488977077, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (51, '', 'A', 'FA', '854', '蔬菜发货区', 7, 1, 1, 11, 1, 0, 1488977082, 0, 1488977082, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (52, '', 'B', 'FB', '854', '标品发货区', 7, 1, 1, 11, 1, 0, 1488977082, 0, 1488977082, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (53, '', 'C', 'FC', '854', '肉禽发货区', 7, 1, 1, 11, 1, 0, 1488977082, 0, 1488977082, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (54, '', 'D', 'FD', '854', '蔬菜投线区', 7, 1, 1, 11, 1, 0, 1488977082, 0, 1488977082, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (55, '', 'H', 'FH', '854', '站点发货区', 7, 1, 1, 11, 1, 0, 1488977082, 0, 1488977082, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (56, '', 'A', 'FA', '854', '蔬菜发货区', 7, 1, 1, 13, 1, 0, 1488977088, 0, 1488977088, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (57, '', 'B', 'FB', '854', '标品发货区', 7, 1, 1, 13, 1, 0, 1488977088, 0, 1488977088, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (58, '', 'C', 'FC', '854', '肉禽发货区', 7, 1, 1, 13, 1, 0, 1488977088, 0, 1488977088, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (59, '', 'D', 'FD', '854', '蔬菜投线区', 7, 1, 1, 13, 1, 0, 1488977088, 0, 1488977088, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (60, '', 'H', 'FH', '854', '站点发货区', 7, 1, 1, 13, 1, 0, 1488977088, 0, 1488977088, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (61, '', 'A', 'FA', '854', '蔬菜发货区', 7, 1, 1, 14, 1, 0, 1488977094, 0, 1488977094, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (62, '', 'B', 'FB', '854', '标品发货区', 7, 1, 1, 14, 1, 0, 1488977094, 0, 1488977094, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (63, '', 'C', 'FC', '854', '肉禽发货区', 7, 1, 1, 14, 1, 0, 1488977094, 0, 1488977094, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (64, '', 'D', 'FD', '854', '蔬菜投线区', 7, 1, 1, 14, 1, 0, 1488977094, 0, 1488977094, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (65, '', 'H', 'FH', '854', '站点发货区', 7, 1, 1, 14, 1, 0, 1488977094, 0, 1488977094, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (66, '', 'A', 'FA', '854', '蔬菜发货区', 7, 1, 1, 15, 1, 0, 1488977099, 0, 1488977099, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (67, '', 'B', 'FB', '854', '标品发货区', 7, 1, 1, 15, 1, 0, 1488977099, 0, 1488977099, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (68, '', 'C', 'FC', '854', '肉禽发货区', 7, 1, 1, 15, 1, 0, 1488977099, 0, 1488977099, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (69, '', 'D', 'FD', '854', '蔬菜投线区', 7, 1, 1, 15, 1, 0, 1488977099, 0, 1488977099, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (70, '', 'H', 'FH', '854', '站点发货区', 7, 1, 1, 15, 1, 0, 1488977099, 0, 1488977099, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (71, '', 'A', 'FA', '854', '蔬菜发货区', 7, 1, 1, 16, 1, 0, 1488977106, 0, 1488977106, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (72, '', 'B', 'FB', '854', '标品发货区', 7, 1, 1, 16, 1, 0, 1488977106, 0, 1488977106, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (73, '', 'C', 'FC', '854', '肉禽发货区', 7, 1, 1, 16, 1, 0, 1488977106, 0, 1488977106, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (74, '', 'D', 'FD', '854', '蔬菜投线区', 7, 1, 1, 16, 1, 0, 1488977106, 0, 1488977106, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (75, '', 'H', 'FH', '854', '站点发货区', 7, 1, 1, 16, 1, 0, 1488977106, 0, 1488977106, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (76, '', 'A', 'FA', '854', '蔬菜发货区', 7, 1, 1, 17, 1, 0, 1488977111, 0, 1488977111, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (77, '', 'B', 'FB', '854', '标品发货区', 7, 1, 1, 17, 1, 0, 1488977111, 0, 1488977111, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (78, '', 'C', 'FC', '854', '肉禽发货区', 7, 1, 1, 17, 1, 0, 1488977111, 0, 1488977111, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (79, '', 'D', 'FD', '854', '蔬菜投线区', 7, 1, 1, 17, 1, 0, 1488977111, 0, 1488977111, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (80, '', 'H', 'FH', '854', '站点发货区', 7, 1, 1, 17, 1, 0, 1488977111, 0, 1488977111, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (81, '', 'A', 'FA', '854', '蔬菜发货区', 7, 1, 1, 18, 1, 0, 1488977116, 0, 1488977116, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (82, '', 'B', 'FB', '854', '标品发货区', 7, 1, 1, 18, 1, 0, 1488977116, 0, 1488977116, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (83, '', 'C', 'FC', '854', '肉禽发货区', 7, 1, 1, 18, 1, 0, 1488977116, 0, 1488977116, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (84, '', 'D', 'FD', '854', '蔬菜投线区', 7, 1, 1, 18, 1, 0, 1488977116, 0, 1488977116, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (85, '', 'H', 'FH', '854', '站点发货区', 7, 1, 1, 18, 1, 0, 1488977116, 0, 1488977116, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (86, '', 'A', 'FA', '854', '蔬菜发货区', 7, 1, 1, 25, 1, 0, 1488977121, 0, 1488977121, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (87, '', 'B', 'FB', '854', '标品发货区', 7, 1, 1, 25, 1, 0, 1488977121, 0, 1488977121, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (88, '', 'C', 'FC', '854', '肉禽发货区', 7, 1, 1, 25, 1, 0, 1488977121, 0, 1488977121, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (89, '', 'D', 'FD', '854', '蔬菜投线区', 7, 1, 1, 25, 1, 0, 1488977121, 0, 1488977121, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (90, '', 'H', 'FH', '854', '站点发货区', 7, 1, 1, 25, 1, 0, 1488977121, 0, 1488977121, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (91, '', 'A', 'FA', '854', '蔬菜发货区', 7, 1, 1, 29, 1, 0, 1488977127, 0, 1488977127, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (92, '', 'B', 'FB', '854', '标品发货区', 7, 1, 1, 29, 1, 0, 1488977127, 0, 1488977127, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (93, '', 'C', 'FC', '854', '肉禽发货区', 7, 1, 1, 29, 1, 0, 1488977127, 0, 1488977127, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (94, '', 'D', 'FD', '854', '蔬菜投线区', 7, 1, 1, 29, 1, 0, 1488977127, 0, 1488977127, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (95, '', 'H', 'FH', '854', '站点发货区', 7, 1, 1, 29, 1, 0, 1488977127, 0, 1488977127, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (96, '', 'A', 'FA', '854', '蔬菜发货区', 7, 1, 1, 30, 1, 0, 1488977133, 0, 1488977133, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (97, '', 'B', 'FB', '854', '标品发货区', 7, 1, 1, 30, 1, 0, 1488977133, 0, 1488977133, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (98, '', 'C', 'FC', '854', '肉禽发货区', 7, 1, 1, 30, 1, 0, 1488977133, 0, 1488977133, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (99, '', 'D', 'FD', '854', '蔬菜投线区', 7, 1, 1, 30, 1, 0, 1488977133, 0, 1488977133, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (100, '', 'H', 'FH', '854', '站点发货区', 7, 1, 1, 30, 1, 0, 1488977133, 0, 1488977133, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (101, '', 'A', 'FA', '854', '蔬菜发货区', 7, 1, 1, 31, 1, 0, 1488977138, 0, 1488977138, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (102, '', 'B', 'FB', '854', '标品发货区', 7, 1, 1, 31, 1, 0, 1488977138, 0, 1488977138, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (103, '', 'C', 'FC', '854', '肉禽发货区', 7, 1, 1, 31, 1, 0, 1488977138, 0, 1488977138, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (104, '', 'D', 'FD', '854', '蔬菜投线区', 7, 1, 1, 31, 1, 0, 1488977138, 0, 1488977138, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (105, '', 'H', 'FH', '854', '站点发货区', 7, 1, 1, 31, 1, 0, 1488977138, 0, 1488977138, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (106, '', 'A', 'FA', '854', '蔬菜发货区', 7, 1, 1, 32, 1, 0, 1488977143, 0, 1488977143, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (107, '', 'B', 'FB', '854', '标品发货区', 7, 1, 1, 32, 1, 0, 1488977143, 0, 1488977143, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (108, '', 'C', 'FC', '854', '肉禽发货区', 7, 1, 1, 32, 1, 0, 1488977143, 0, 1488977143, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (109, '', 'D', 'FD', '854', '蔬菜投线区', 7, 1, 1, 32, 1, 0, 1488977143, 0, 1488977143, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (110, '', 'H', 'FH', '854', '站点发货区', 7, 1, 1, 32, 1, 0, 1488977143, 0, 1488977143, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (111, '', 'A', 'FA', '854', '蔬菜发货区', 7, 1, 1, 33, 1, 0, 1488977149, 0, 1488977149, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (112, '', 'B', 'FB', '854', '标品发货区', 7, 1, 1, 33, 1, 0, 1488977149, 0, 1488977149, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (113, '', 'C', 'FC', '854', '肉禽发货区', 7, 1, 1, 33, 1, 0, 1488977149, 0, 1488977149, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (114, '', 'D', 'FD', '854', '蔬菜投线区', 7, 1, 1, 33, 1, 0, 1488977149, 0, 1488977149, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (115, '', 'H', 'FH', '854', '站点发货区', 7, 1, 1, 33, 1, 0, 1488977149, 0, 1488977149, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (116, '', 'A', 'FA', '854', '蔬菜发货区', 7, 1, 1, 35, 1, 0, 1488977154, 0, 1488977154, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (117, '', 'B', 'FB', '854', '标品发货区', 7, 1, 1, 35, 1, 0, 1488977154, 0, 1488977154, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (118, '', 'C', 'FC', '854', '肉禽发货区', 7, 1, 1, 35, 1, 0, 1488977154, 0, 1488977154, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (119, '', 'D', 'FD', '854', '蔬菜投线区', 7, 1, 1, 35, 1, 0, 1488977154, 0, 1488977154, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (120, '', 'H', 'FH', '854', '站点发货区', 7, 1, 1, 35, 1, 0, 1488977154, 0, 1488977154, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (121, '', 'A', 'FA', '854', '蔬菜发货区', 7, 1, 1, 36, 1, 0, 1488977159, 0, 1488977159, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (122, '', 'B', 'FB', '854', '标品发货区', 7, 1, 1, 36, 1, 0, 1488977159, 0, 1488977159, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (123, '', 'C', 'FC', '854', '肉禽发货区', 7, 1, 1, 36, 1, 0, 1488977159, 0, 1488977159, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (124, '', 'D', 'FD', '854', '蔬菜投线区', 7, 1, 1, 36, 1, 0, 1488977159, 0, 1488977159, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (125, '', 'H', 'FH', '854', '站点发货区', 7, 1, 1, 36, 1, 0, 1488977159, 0, 1488977159, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (126, '', 'A', 'FA', '854', '蔬菜发货区', 7, 1, 1, 37, 1, 0, 1488977163, 0, 1488977163, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (127, '', 'B', 'FB', '854', '标品发货区', 7, 1, 1, 37, 1, 0, 1488977163, 0, 1488977163, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (128, '', 'C', 'FC', '854', '肉禽发货区', 7, 1, 1, 37, 1, 0, 1488977163, 0, 1488977163, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (129, '', 'D', 'FD', '854', '蔬菜投线区', 7, 1, 1, 37, 1, 0, 1488977163, 0, 1488977163, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (130, '', 'H', 'FH', '854', '站点发货区', 7, 1, 1, 37, 1, 0, 1488977163, 0, 1488977163, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (131, '', 'A', 'FA', '854', '蔬菜发货区', 7, 1, 1, 38, 1, 0, 1488977167, 0, 1488977167, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (132, '', 'B', 'FB', '854', '标品发货区', 7, 1, 1, 38, 1, 0, 1488977167, 0, 1488977167, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (133, '', 'C', 'FC', '854', '肉禽发货区', 7, 1, 1, 38, 1, 0, 1488977167, 0, 1488977167, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (134, '', 'D', 'FD', '854', '蔬菜投线区', 7, 1, 1, 38, 1, 0, 1488977167, 0, 1488977167, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (135, '', 'H', 'FH', '854', '站点发货区', 7, 1, 1, 38, 1, 0, 1488977167, 0, 1488977167, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (136, '', 'A', 'FA', '854', '蔬菜发货区', 7, 1, 1, 39, 1, 0, 1488977172, 0, 1488977172, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (137, '', 'B', 'FB', '854', '标品发货区', 7, 1, 1, 39, 1, 0, 1488977172, 0, 1488977172, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (138, '', 'C', 'FC', '854', '肉禽发货区', 7, 1, 1, 39, 1, 0, 1488977172, 0, 1488977172, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (139, '', 'D', 'FD', '854', '蔬菜投线区', 7, 1, 1, 39, 1, 0, 1488977172, 0, 1488977172, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (140, '', 'H', 'FH', '854', '站点发货区', 7, 1, 1, 39, 1, 0, 1488977172, 0, 1488977172, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (141, '', 'A', 'FA', '854', '蔬菜发货区', 7, 1, 1, 41, 1, 0, 1488977178, 0, 1488977178, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (142, '', 'B', 'FB', '854', '标品发货区', 7, 1, 1, 41, 1, 0, 1488977178, 0, 1488977178, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (143, '', 'C', 'FC', '854', '肉禽发货区', 7, 1, 1, 41, 1, 0, 1488977178, 0, 1488977178, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (144, '', 'D', 'FD', '854', '蔬菜投线区', 7, 1, 1, 41, 1, 0, 1488977178, 0, 1488977178, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (145, '', 'H', 'FH', '854', '站点发货区', 7, 1, 1, 41, 1, 0, 1488977178, 0, 1488977178, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (146, '', 'A', 'FA', '854', '蔬菜发货区', 7, 1, 1, 42, 1, 0, 1488977184, 0, 1488977184, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (147, '', 'B', 'FB', '854', '标品发货区', 7, 1, 1, 42, 1, 0, 1488977184, 0, 1488977184, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (148, '', 'C', 'FC', '854', '肉禽发货区', 7, 1, 1, 42, 1, 0, 1488977184, 0, 1488977184, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (149, '', 'D', 'FD', '854', '蔬菜投线区', 7, 1, 1, 42, 1, 0, 1488977184, 0, 1488977184, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (150, '', 'H', 'FH', '854', '站点发货区', 7, 1, 1, 42, 1, 0, 1488977184, 0, 1488977184, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (151, '', 'A', 'FA', '854', '蔬菜发货区', 7, 1, 1, 43, 1, 0, 1488977188, 0, 1488977188, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (152, '', 'B', 'FB', '854', '标品发货区', 7, 1, 1, 43, 1, 0, 1488977188, 0, 1488977188, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (153, '', 'C', 'FC', '854', '肉禽发货区', 7, 1, 1, 43, 1, 0, 1488977188, 0, 1488977188, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (154, '', 'D', 'FD', '854', '蔬菜投线区', 7, 1, 1, 43, 1, 0, 1488977188, 0, 1488977188, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (155, '', 'H', 'FH', '854', '站点发货区', 7, 1, 1, 43, 1, 0, 1488977188, 0, 1488977188, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (156, '', 'A', 'FA', '854', '蔬菜发货区', 7, 1, 1, 44, 1, 0, 1488977192, 0, 1488977192, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (157, '', 'B', 'FB', '854', '标品发货区', 7, 1, 1, 44, 1, 0, 1488977192, 0, 1488977192, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (158, '', 'C', 'FC', '854', '肉禽发货区', 7, 1, 1, 44, 1, 0, 1488977192, 0, 1488977192, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (159, '', 'D', 'FD', '854', '蔬菜投线区', 7, 1, 1, 44, 1, 0, 1488977192, 0, 1488977192, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (160, '', 'H', 'FH', '854', '站点发货区', 7, 1, 1, 44, 1, 0, 1488977192, 0, 1488977192, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (161, '', 'A', 'FA', '854', '蔬菜发货区', 7, 1, 1, 45, 1, 0, 1488977196, 0, 1488977196, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (162, '', 'B', 'FB', '854', '标品发货区', 7, 1, 1, 45, 1, 0, 1488977196, 0, 1488977196, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (163, '', 'C', 'FC', '854', '肉禽发货区', 7, 1, 1, 45, 1, 0, 1488977196, 0, 1488977196, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (164, '', 'D', 'FD', '854', '蔬菜投线区', 7, 1, 1, 45, 1, 0, 1488977196, 0, 1488977196, '0', '', 0);
INSERT INTO `pdms_sorting_center_area` VALUES (165, '', 'H', 'FH', '854', '站点发货区', 7, 1, 1, 45, 1, 0, 1488977196, 0, 1488977196, '0', '', 0);

 
 
 -- 初始化一级分类配置发货区关联数据--,按仓查询,仅stage环境执行
 INSERT INTO `pdms_sorting_center_area_class1_ref`
(class1id,sorting_center_id,sorting_center_area_id,creater,c_t,updater,u_t,update_name,is_deleted)
 VALUES
  (1, 1, 1, 0, unix_timestamp(now()), 0, unix_timestamp(now()), '', 0),
  (2, 1, 3, 0, unix_timestamp(now()), 0, unix_timestamp(now()), '', 0),
  (3, 1, 2, 0, unix_timestamp(now()), 0, unix_timestamp(now()), '', 0),
  (4, 1, 2, 0, unix_timestamp(now()), 0, unix_timestamp(now()), '', 0),
  (5, 1, 3, 0, unix_timestamp(now()), 0, unix_timestamp(now()), '', 0),
  (8, 1, 2, 0, unix_timestamp(now()), 0, unix_timestamp(now()), '', 0),
  (11, 1, 2, 0, unix_timestamp(now()), 0, unix_timestamp(now()), '', 0),
  (20, 1, 1, 0, unix_timestamp(now()), 0, unix_timestamp(now()), '', 0),
  (21, 1, 3, 0, unix_timestamp(now()), 0, unix_timestamp(now()), '', 0),
  (1, 29, 1, 0, unix_timestamp(now()), 0, unix_timestamp(now()), '', 0),
  (2, 29, 3, 0, unix_timestamp(now()), 0, unix_timestamp(now()), '', 0),
  (3, 29, 2, 0, unix_timestamp(now()), 0, unix_timestamp(now()), '', 0),
  (4, 29, 2, 0, unix_timestamp(now()), 0, unix_timestamp(now()), '', 0),
  (5, 29, 3, 0, unix_timestamp(now()), 0, unix_timestamp(now()), '', 0),
  (8, 29, 2, 0, unix_timestamp(now()), 0, unix_timestamp(now()), '', 0),
  (11, 29, 2, 0, unix_timestamp(now()), 0, unix_timestamp(now()), '', 0);


