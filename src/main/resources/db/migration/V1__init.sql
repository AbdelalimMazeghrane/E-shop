-- Création de la table des utilisateurs
CREATE TABLE utilisateurs (
    id SERIAL PRIMARY KEY,
    nom VARCHAR(255) NOT NULL
);

-- Création de la table des produits
CREATE TABLE produits (
    id SERIAL PRIMARY KEY,
    nom VARCHAR(255) NOT NULL,
    description TEXT,
    image_url VARCHAR(255),
    prix DECIMAL(10, 2) NOT NULL,
    category VARCHAR(255)
);

-- Création de la table des paniers
CREATE TABLE paniers (
    id SERIAL PRIMARY KEY,
    utilisateur_id BIGINT REFERENCES utilisateurs(id)
);

-- Création de la table des éléments de panier
CREATE TABLE panier_produits (
    id SERIAL PRIMARY KEY,
    panier_id BIGINT REFERENCES paniers(id),
    produit_id BIGINT REFERENCES produits(id),
    quantite INT NOT NULL
);

-- Création de la table des commandes
CREATE TABLE commandes (
    id SERIAL PRIMARY KEY,
    utilisateur_id BIGINT REFERENCES utilisateurs(id),
    total_cout DECIMAL(10, 2) NOT NULL,
    adresse_livraison TEXT
);

-- Création de la table des produits de commande
CREATE TABLE commande_produits (
    id SERIAL PRIMARY KEY,
    commande_id BIGINT REFERENCES commandes(id),
    produit_id BIGINT REFERENCES produits(id),
    quantite INT NOT NULL
);
