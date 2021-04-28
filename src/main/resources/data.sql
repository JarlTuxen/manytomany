INSERT INTO authors (name)
VALUES
    ('Dan Türell'),
    ('Tove Ditlevsen'),
    ('Bjarne Reuter'),
    ('Lotte Rienecker'),
    ('Peter Stray Jørgensen');
INSERT INTO books (title)
VALUES
    ('Mord i Mørket'),
    ('Barndommens Gade'),
    ('Kidnapning'),
    ('Den Gode Opgave'),
    ('Karma Cowboy');
INSERT INTO author_book (author_id, book_id)
VALUES
    (1, 1),
    (1, 5),
    (2, 2),
    (3, 3),
    (4, 4),
    (5, 4);

