from db_mysql import get_contact_table

def display_table(columns, rows):

    col_widths = [max(len(str(col)), max(len(str(row[i])) for row in rows)) + 2 for i, col in enumerate(columns)]

    # Function to format row
    def format_row(row):
        return "| " + " | ".join(str(col).ljust(col_widths[i]) for i, col in enumerate(row)) + " |"

    # Print header
    print("+" + "+".join("-" * (w + 2) for w in col_widths) + "+")
    print(format_row(columns))
    print("+" + "+".join("-" * (w + 2) for w in col_widths) + "+")

    # Print data rows
    for row in rows:
        print(format_row(row))

    print("+" + "+".join("-" * (w + 2) for w in col_widths) + "+")

cols, data = get_contact_table()
display_table(cols, data)
