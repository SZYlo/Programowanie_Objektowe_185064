package zadanie10;

class Document {
    public Document copy() { return new Document(); }
}

class Report extends Document {
    @Override
    public Report copy() { return new Report(); }
}
