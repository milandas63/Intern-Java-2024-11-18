from db2_mysql import get_contact_table

def display_table(columns, rows):
    # Define column widths based on column names and content
    col_widths = [max(len(str(col)), max(len(str(row[i])) for row in rows)) + 2 for i, col in enumerate(columns)]

    # Function to format a row
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

# Direct call to functions (always runs when script is run or imported)
cols, data = get_contact_table()
display_table(cols, data)